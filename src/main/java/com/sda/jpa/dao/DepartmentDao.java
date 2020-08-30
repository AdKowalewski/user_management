package com.sda.jpa.dao;

import com.sda.jpa.model.Department;
import com.sda.jpa.utils.JPAUtil;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;

public class DepartmentDao implements GenericDao<Department> {
    JPAUtil JpaHelper = new JPAUtil();

    @Override
    public Department get(long id) {
        try {
            // SELECT * FROM department WHERE departmentId = {id}
            // return JpaHelper.getEntityManager().find(Department.class, id);
            Query query = JpaHelper.getEntityManager().createQuery("FROM department d WHERE d.departmentId = :id");
            query.setParameter("id", id);
            return (Department) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Department> getAll() {
        Query query = JpaHelper.getEntityManager().createQuery("FROM department d");
        return query.getResultList();
    }

    @Override
    public Department save(Department entity) {
        JpaHelper.doInTransaction((entityManager) -> {
            entityManager.persist(entity);
        });
        return entity;
    }

    @Override
    public void delete(long id) {
        JpaHelper.doInTransaction((entityManager -> {
            entityManager.remove(this.get(id));
        }));
    }

    @Override
    public void update(Department entity) {
        JpaHelper.doInTransaction((entityManager -> {
            entityManager.merge(entity);
        }));
    }

    public List<Department> findByName(String name) {
        Query query = JpaHelper.getEntityManager().createQuery("FROM department d WHERE d.name like :name");
        query.setParameter("name", "%" + name + "%");
        return query.getResultList();
    }
 }

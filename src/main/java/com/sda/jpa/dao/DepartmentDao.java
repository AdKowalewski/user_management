package com.sda.jpa.dao;

import com.sda.jpa.model.Department;
import com.sda.jpa.utils.JPAUtil;

import javax.persistence.Query;
import java.util.List;

public class DepartmentDao implements GenericDao<Department> {
    JPAUtil JpaHelper = new JPAUtil();

    @Override
    public Department get(long id) {
        return JpaHelper.getEntityManager().find(Department.class, id);
    }

    @Override
    public List<Department> getAll() {
        Query query = JpaHelper.getEntityManager().createQuery("SELECT d FROM department d", Department.class);
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
        Department dep = get(id);
        JpaHelper.getEntityManager().remove(dep);
    }

    @Override
    public void update(Department entity) {
        Query query = JpaHelper.getEntityManager().createQuery("updateDepartment", Department.class);
    }
}

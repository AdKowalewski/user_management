package com.sda.jpa.dao;

import com.sda.jpa.model.Worker;
import com.sda.jpa.utils.JPAUtil;

import javax.persistence.Query;
import java.util.List;

public class WorkerDao implements GenericDao<Worker> {
    JPAUtil JpaHelper = new JPAUtil();

    @Override
    public Worker get(long id) {
        // SELECT * FROM worker WHERE workerId = {id}
        // return JpaHelper.getEntityManager().find(Worker.class, id);
        Query query = JpaHelper.getEntityManager().createQuery("SELECT w FROM worker w WHERE w.workerId = :id");
        query.setParameter("id", id);
        return (Worker) query.getSingleResult();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Worker> getAll() {
        Query query = JpaHelper.getEntityManager().createQuery("SELECT w FROM worker w");
        return query.getResultList();
    }

    @Override
    public Worker save(Worker entity) {
        JpaHelper.doInTransaction((entityManager) -> {
            entityManager.persist(entity);
        });
        return entity;
    }

    @Override
    public void delete(long id) {
        Worker wor = get(id);
        JpaHelper.getEntityManager().remove(wor);
    }

    @Override
    public void update(Worker entity) {
        JpaHelper.doInTransaction((entityManager -> {
            entityManager.merge(entity);
        }));
    }
}

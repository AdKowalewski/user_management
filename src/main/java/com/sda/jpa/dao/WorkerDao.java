package com.sda.jpa.dao;

import com.sda.jpa.model.Department;
import com.sda.jpa.model.Worker;
import com.sda.jpa.utils.JPAUtil;
import org.hibernate.cfg.JPAIndexHolder;

import javax.persistence.Query;
import java.util.List;

public class WorkerDao implements GenericDao<Worker> {
    JPAUtil JpaHelper = new JPAUtil();

    @Override
    public Worker get(long id) {
        return JpaHelper.getEntityManager().find(Worker.class, id);
    }

    @Override
    public List<Worker> getAll() {
        Query query = JpaHelper.getEntityManager().createQuery("SELECT w FROM worker w", Worker.class);
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
        Query query = JpaHelper.getEntityManager().createQuery("updateWorker", Worker.class);
    }
}

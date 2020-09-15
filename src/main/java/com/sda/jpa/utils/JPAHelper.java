package com.sda.jpa.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.function.Consumer;

public class JPAHelper {
    private static EntityManager entityManager;
    private final static Object lock = new Object();

    public static EntityManager getEntityManager() {
        if (entityManager == null) {
            synchronized (lock) {
                if (entityManager == null) {
                    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysqlPU");
                    entityManager = entityManagerFactory.createEntityManager();
        }
    }
        }
        return entityManager;
    }

    public static void doInTransaction (Consumer<EntityManager> action) {
        try {
            EntityTransaction transaction = getEntityManager().getTransaction();
            transaction.begin();
            action.accept(getEntityManager());
            transaction.commit();
        } catch (RuntimeException ex) {
            getEntityManager().getTransaction().rollback();
            throw new RuntimeException(ex);
        }
    }
}

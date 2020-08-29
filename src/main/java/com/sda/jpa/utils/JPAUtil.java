package com.sda.jpa.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.function.Consumer;

public class JPAUtil {
    private static EntityManager entityManager;

    public static EntityManager getEntityManager() {
        if(entityManager == null) {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysqlPU");
            entityManager = entityManagerFactory.createEntityManager();
        }
        return entityManager;
    }

    public static void doInTransaction (Consumer<EntityManager> action) {

    }
}

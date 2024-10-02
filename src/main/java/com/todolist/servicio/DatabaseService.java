package com.todolist.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseService {

    private static final String PERSISTENCE_UNIT_NAME = "tasks";
    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public DatabaseService() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        entityManager = factory.createEntityManager();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void close() {
        entityManager.close();
        factory.close();
    }
}

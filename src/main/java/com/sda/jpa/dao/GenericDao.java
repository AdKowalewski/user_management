package com.sda.jpa.dao;

import java.util.List;

/**
 * Generic interface for DAO classes making CRUD operations.
 */
public interface GenericDao<T> {
    /**
     * Returns entity for a given id.
     * @param id entity identifier
     * @return entity
     */
    T get (long id);

    /**
     * @return list of all entities
     */
    List<T> getAll();

    /**
     * Saves new entity.
     * @param entity entity name
     * @return entity
     */
    T save (T entity);

    /**
     * Deletes existing entity.
     * @param id entity identifier
     */
    void delete (long id);

    /**
     * Updates existing entity.
     * @param entity entity indentifier
     */
    void update (T entity);
}

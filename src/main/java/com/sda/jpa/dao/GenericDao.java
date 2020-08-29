package com.sda.jpa.dao;

import java.util.List;

public interface GenericDao <T> {

    T get (int id);

    void delete (int id);

    List<T> getAll();

    void update (T entity);
    
    void save (T entity);
}

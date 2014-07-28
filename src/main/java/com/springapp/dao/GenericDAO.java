package com.springapp.dao;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by glaucia on 27/07/14.
 */
public class GenericDAO {

    private EntityManager entityManager;

    public GenericDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public <T> T getById(Class<T> clazz, Long id) {
        return (T) entityManager.find(clazz, id);
    }

    public <T> void save(T entity) {
        entityManager.persist(entity);
    }

    public <T> void update(T entity) {
        entityManager.merge(entity);
    }

    public <T> void delete(T entity) {
        entityManager.remove(entity);
    }

    public <T> List<T> findAll(Class<T> clazz) {
        return entityManager.createQuery("FROM " + clazz.getName()).getResultList();
    }
}

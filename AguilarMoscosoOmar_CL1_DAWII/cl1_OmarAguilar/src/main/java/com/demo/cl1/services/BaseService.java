package com.demo.cl1.services;

import com.demo.cl1.entities.BaseEntity;

import java.io.Serializable;

public interface BaseService<E extends BaseEntity, ID extends Serializable>{
    public E save(E entity) throws Exception;
}

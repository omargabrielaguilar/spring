package com.demo.cl1.services;

import jakarta.transaction.Transactional;
import com.demo.cl1.entities.BaseEntity;
import com.demo.cl1.repositories.BaseRepository;

import java.io.Serializable;


public abstract class BaseServiceImpl<E extends BaseEntity, ID extends Serializable> implements BaseService<E, ID> {
    protected BaseRepository<E, ID> baseRepository;
    public BaseServiceImpl(BaseRepository<E, ID> baseRepository){
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
            entity = baseRepository.save(entity);
            return entity;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}

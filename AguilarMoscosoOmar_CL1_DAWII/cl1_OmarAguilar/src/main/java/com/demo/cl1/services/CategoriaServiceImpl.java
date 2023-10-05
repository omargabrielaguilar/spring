package com.demo.cl1.services;

import com.demo.cl1.entities.CategoriaEntity;
import com.demo.cl1.repositories.BaseRepository;
import com.demo.cl1.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<CategoriaEntity, Long> implements  CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    public CategoriaServiceImpl(BaseRepository<CategoriaEntity, Long> baseRepository) {
        super(baseRepository);
    }

}

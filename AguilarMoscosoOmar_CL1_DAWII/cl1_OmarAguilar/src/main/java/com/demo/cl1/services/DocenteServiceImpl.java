package com.demo.cl1.services;

import com.demo.cl1.entities.DocenteEntity;
import com.demo.cl1.repositories.BaseRepository;
import com.demo.cl1.repositories.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocenteServiceImpl extends BaseServiceImpl<DocenteEntity, Long> implements  DocenteService{

    @Autowired
    private DocenteRepository docenteRepository;
    public DocenteServiceImpl(BaseRepository<DocenteEntity, Long> baseRepository) {
        super(baseRepository);
    }
}

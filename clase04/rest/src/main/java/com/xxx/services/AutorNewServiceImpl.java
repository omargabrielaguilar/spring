package com.xxx.services;

import com.xxx.entities.AutorEntity;
import com.xxx.repositories.AutorRepository;
import com.xxx.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorNewServiceImpl extends BaseNewServiceImpl<AutorEntity, Long> implements AutorNewService{

    // @Autowired
    private AutorRepository autorRepository;

    public AutorNewServiceImpl(BaseRepository<AutorEntity, Long> baseRepository) {
        super(baseRepository);
    }
}

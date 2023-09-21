package com.xxx.services;


import com.xxx.entities.LocalidadEntity;
import com.xxx.repositories.BaseRepository;
import com.xxx.repositories.LocalidadRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadNewServiceImpl extends BaseNewServiceImpl<LocalidadEntity, Long> implements LocalidadNewService {
    private LocalidadRepository localidadRepository;

    public LocalidadNewServiceImpl(BaseRepository<LocalidadEntity, Long> baseRepository) {
        super(baseRepository);
    }
}

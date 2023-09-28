package org.dksoft.prjapirestmaster.services;

import org.dksoft.prjapirestmaster.entities.LocalidadEntity;
import org.dksoft.prjapirestmaster.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<LocalidadEntity, Long> implements LocalidadService {
    public LocalidadServiceImpl(BaseRepository<LocalidadEntity, Long> baseRepository) {
        super(baseRepository);
    }
}

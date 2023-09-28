package org.dksoft.prjapirestmaster.services;

import org.dksoft.prjapirestmaster.entities.AutorEntity;
import org.dksoft.prjapirestmaster.repositories.AutorRepository;
import org.dksoft.prjapirestmaster.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<AutorEntity, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<AutorEntity, Long> baseRepository) {
        super(baseRepository);
    }
}

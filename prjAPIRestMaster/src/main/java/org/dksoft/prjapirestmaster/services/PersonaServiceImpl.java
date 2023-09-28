package org.dksoft.prjapirestmaster.services;

import org.dksoft.prjapirestmaster.entities.PersonaEntity;
import org.dksoft.prjapirestmaster.repositories.BaseRepository;
import org.dksoft.prjapirestmaster.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<PersonaEntity, Long> implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;
    public PersonaServiceImpl(BaseRepository<PersonaEntity, Long> baseRepository) {
        super(baseRepository);
    }
}

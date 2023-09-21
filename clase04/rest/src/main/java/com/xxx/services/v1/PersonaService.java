package com.xxx.services.v1;

import com.xxx.entities.PersonaEntity;
import com.xxx.repositories.PersonaRepository;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PersonaService implements BaseService<PersonaEntity>{

    @Autowired
    private PersonaRepository personaRepository;

    /* public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    } */

    @Override
    @Transactional
    public List<PersonaEntity> findAll() throws Exception {
        try {
            List<PersonaEntity> entities = personaRepository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public PersonaEntity findById(Long id) throws Exception {
        try {
            Optional<PersonaEntity> entityOptional = personaRepository.findById(id);
            return entityOptional.get();
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public PersonaEntity save(PersonaEntity entity) throws Exception {
        try {
            entity = personaRepository.save(entity);
            return entity;
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public PersonaEntity update(Long id, PersonaEntity entity) throws Exception {
        try{
            Optional<PersonaEntity> entityOptional = personaRepository.findById(id);
            PersonaEntity persona = entityOptional.get();
            persona = personaRepository.save(entity);
            return persona;
        } catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }


    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            if(personaRepository.existsById(id)) {
                personaRepository.deleteById(id);
                return true;
            } else  {
                throw new Exception();
            }
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}

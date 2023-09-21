package com.xxx.controllers;

import com.xxx.entities.BaseEntity;
import com.xxx.services.BaseNewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

public class BaseControllerImpl <E extends BaseEntity, S extends BaseNewServiceImpl<E, Long>> implements BaseController<E, Long> {

    @Autowired
    protected S servicio;

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":Error. Por favor intente más tarde. \"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findById(id));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":Error. Por favor intente más tarde. \"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(E entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.save(entity));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":Error. Por favor intente más tarde. \"}");
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update(Long id, E entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.update(id, entity));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":Error. Por favor intente más tarde. \"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.delete(id));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":Error. Por favor intente más tarde. \"}");
        }
    }
}

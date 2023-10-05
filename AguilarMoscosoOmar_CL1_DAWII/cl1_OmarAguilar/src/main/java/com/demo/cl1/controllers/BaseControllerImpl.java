package com.demo.cl1.controllers;

import com.demo.cl1.entities.BaseEntity;
import com.demo.cl1.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class BaseControllerImpl<E extends BaseEntity, S extends BaseServiceImpl<E, Long>> implements BaseController<E, Long> {
    @Autowired
    protected S servicio;

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entity){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.save(entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

}
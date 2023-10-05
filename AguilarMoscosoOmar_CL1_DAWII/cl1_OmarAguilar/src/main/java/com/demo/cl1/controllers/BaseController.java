package com.demo.cl1.controllers;

import com.demo.cl1.entities.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController <E extends BaseEntity, ID extends Serializable> {
    public ResponseEntity<?> save(@RequestBody E entity);
}

package com.demo.cl1.controllers;

import com.demo.cl1.entities.CategoriaEntity;
import com.demo.cl1.services.CategoriaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/categorias")
public class CategoriaController
        extends BaseControllerImpl<CategoriaEntity, CategoriaServiceImpl> {
}
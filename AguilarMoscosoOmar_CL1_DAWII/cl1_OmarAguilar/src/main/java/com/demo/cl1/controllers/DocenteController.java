package com.demo.cl1.controllers;

import com.demo.cl1.entities.DocenteEntity;
import com.demo.cl1.services.DocenteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/docentes")
public class DocenteController extends BaseControllerImpl<DocenteEntity, DocenteServiceImpl> {
}

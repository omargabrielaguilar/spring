package com.xxx.controllers;

import com.xxx.entities.LocalidadEntity;
import com.xxx.services.LocalidadNewServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<LocalidadEntity, LocalidadNewServiceImpl> {
}

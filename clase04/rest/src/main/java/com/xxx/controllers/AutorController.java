package com.xxx.controllers;

import com.xxx.entities.AutorEntity;
import com.xxx.services.AutorNewServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<AutorEntity, AutorNewServiceImpl> {
}

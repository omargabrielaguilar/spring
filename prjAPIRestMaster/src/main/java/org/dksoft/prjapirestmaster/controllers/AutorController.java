package org.dksoft.prjapirestmaster.controllers;

import org.dksoft.prjapirestmaster.entities.AutorEntity;
import org.dksoft.prjapirestmaster.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<AutorEntity, AutorServiceImpl>{
}

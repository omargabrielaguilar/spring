package org.dksoft.prjapirestmaster.controllers;

import org.dksoft.prjapirestmaster.entities.PersonaEntity;
import org.dksoft.prjapirestmaster.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<PersonaEntity, PersonaServiceImpl>{
}

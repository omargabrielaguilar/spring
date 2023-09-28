package org.dksoft.prjapirestmaster.controllers;

import org.dksoft.prjapirestmaster.entities.LocalidadEntity;
import org.dksoft.prjapirestmaster.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<LocalidadEntity, LocalidadServiceImpl>{
}

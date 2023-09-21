package com.xxx.controllers;


import com.xxx.entities.PersonaEntity;
import com.xxx.services.v1.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    /* public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    } */

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(personaService.findAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":Error. Por favor intente más tarde. \"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(personaService.findById(id));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":Error. Por favor intente más tarde. \"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody PersonaEntity entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(personaService.save(entity));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":Error. Por favor intente más tarde. \"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody PersonaEntity entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(personaService.update(id, entity));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":Error. Por favor intente más tarde. \"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(personaService.delete(id));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":Error. Por favor intente más tarde. \"}");
        }
    }
}

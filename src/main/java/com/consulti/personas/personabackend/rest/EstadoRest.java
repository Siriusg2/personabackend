package com.consulti.personas.personabackend.rest;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.consulti.personas.personabackend.model.*;

import com.consulti.personas.personabackend.service.EstadoService;

@RestController
@RequestMapping("/estado/")
public class EstadoRest {
    @Autowired
    private EstadoService estadoService;

    @GetMapping
    private ResponseEntity<List<Estado>> getAllEstados(){
        return ResponseEntity.ok( estadoService.findAll());
    }

}

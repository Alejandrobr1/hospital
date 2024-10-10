package com.agenciacafespring.controller;

import com.agenciacafespring.entitys.Persona;
import com.agenciacafespring.services.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("person/v1")
@RequiredArgsConstructor
public class PersonaRestController {

    private final PersonaService personaService;

    @GetMapping("/list")
    public ResponseEntity<List<Persona>> list() {
        List<Persona> personaList = personaService.getListPersons();
        return new ResponseEntity<>(personaList, HttpStatus.ACCEPTED);
    }
}

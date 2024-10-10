package com.agenciacafespring.services.service;

import com.agenciacafespring.entitys.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> getListPersons(); //este es el que se expone al controlador
}

package com.agenciacafespring.services;

import com.agenciacafespring.entitys.Persona;
import com.agenciacafespring.entitys.repository.PersonaRepository;
import com.agenciacafespring.services.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //valida que la app este funcionando y este correcta,emnte conectada o puede usarse @Component. este es un BEAN
@RequiredArgsConstructor //se hace inyeccion de dependencia independientemente
public class PersonaServiceImplement implements PersonaService {


    //@Autowired este reemplaza el constructor y este tiene problema porque depende de una clase

    private final PersonaRepository personaRepository;


    @Override
    public List<Persona> getListPersons() {
        return personaRepository.ListPersons();
    }
}

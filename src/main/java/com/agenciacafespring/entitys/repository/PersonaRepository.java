package com.agenciacafespring.entitys.repository;

import com.agenciacafespring.entitys.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

    @Query(value = "SELECT * FROM personas", nativeQuery = true)//lo hace de forma nativa lo hace mas rapido
    List<Persona> ListPersons();

    //@Override //aca sobreescribo, el ORM le cuesta mas
    //List<Persona> findAll();
}

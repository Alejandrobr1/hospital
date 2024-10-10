package com.agenciacafespring.entitys.repository;

import com.agenciacafespring.entitys.Persona;
import com.agenciacafespring.entitys.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento, Integer> {

    @Query(value = "SELECT * FROM tipo_documentos", nativeQuery = true)//lo hace de forma nativa lo hace mas rapido
    List<TipoDocumento> ListTipoDocumentos();
}

package com.agenciacafespring.entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_documentos") //el nombre debe ser igual al de la base de datos

public class TipoDocumento {


    @Id
    @Column(name = "id")// Persistencia
    @GeneratedValue(strategy = GenerationType.IDENTITY) //identifica el valor anterior incrementa de 1 en 1 pero lo hace la base de datos no Java
    private int id; //objeto Java

    @Column(name = "sigla") //persistencia
    private String sigla; //objeto java

    @Column(name = "descripcion") //persistencia
    private String descripcion; //objeto Java

    public TipoDocumento() {

    }

    public TipoDocumento(int id, String sigla, String descripcion) {
        this.id = id;
        this.sigla = sigla;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

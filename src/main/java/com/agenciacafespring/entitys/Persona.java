package com.agenciacafespring.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "personas") //API persistencia de java

@Data //podria ser @Getter y @Setter y @AllArgsConstructor, @NoArgsConstructor y es Lombok

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "nombres") //persistencia de java
    private String nombre; //Lombok

    @Column(name = "Apellidos",nullable = false) //persistencia de java
    private String apellido; //Lombok

    @ManyToOne
    @JoinColumn(name = "fk_tipo_documento",referencedColumnName = "id",nullable = false)
    private TipoDocumento fk_tipo_documento; //Lombok

}

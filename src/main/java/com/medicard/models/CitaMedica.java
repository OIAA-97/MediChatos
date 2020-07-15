package com.medicard.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="citamedica")
public class CitaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcita")
    private int idCita;
    @Column(name="", columnDefinition = "varchar(50)")
    private String aPaterno;
    @Column(name="a_materno", columnDefinition = "varchar(50)")
    private String aMaterno;
    @Column(name="nombre", columnDefinition = "varchar(50)")
    private String Nombre;
    @Column(name="direccion", columnDefinition = "varchar(50)")
    private String Direccion;
    @Column(name="telefono", columnDefinition = "varchar(50)")
    private String Telefono;
    @Column(name="fecha_nac", columnDefinition = "date")
    private Date fechaNac;
    @Column(name="sexo", columnDefinition = "varchar(50)")
    private String Sexo;


}

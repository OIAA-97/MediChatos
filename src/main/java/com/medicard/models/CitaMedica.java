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
    @Column(name="a_paterno", columnDefinition = "varchar(50)")
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

    public CitaMedica() {
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }
}

package com.medicard.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idempleado")
    private int idEmpleado;
    @Column(name="a_patern", columnDefinition = "varchar(50)")
    private String Apaterno;
    @Column(name="a_matern")
    private String Amaterno;
    @Column(name="nombre", columnDefinition = "varchar(50)")
    private String Nombre;
    @Column(name="direccion", columnDefinition = "varchar(50)")
    private String Direccion;
    @Column(name="telefono", columnDefinition = "varchar(50)")
    private String Telefono;
    @Column(name="fecha_nac", columnDefinition = "date")
    private Date FechaNac;
    @Column(name="sexo", columnDefinition = "varchar(50)")
    private String Sexo;
    @Column(name="num_empleado")
    private int NumEmpleado;
    @Column(name="ocupacion", columnDefinition = "varchar(50)")
    private String Ocupacion;
    @Column(name="contraseña", columnDefinition = "varchar(50)")
    private String Contraseña;

    public Empleado() {
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getApaterno() {
        return Apaterno;
    }

    public void setApaterno(String apaterno) {
        Apaterno = apaterno;
    }

    public String getAmaterno() {
        return Amaterno;
    }

    public void setAmaterno(String amaterno) {
        Amaterno = amaterno;
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
        return FechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        FechaNac = fechaNac;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public int getNumEmpleado() {
        return NumEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        NumEmpleado = numEmpleado;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        Ocupacion = ocupacion;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }
}

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
    @Column(name="Num_Empleado")
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

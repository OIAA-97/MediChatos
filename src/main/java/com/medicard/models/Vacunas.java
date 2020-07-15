package com.medicard.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="vacunas")
public class Vacunas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idvacuna")
    private int idVacuna;
    @Column(name="enfermedad_pre", columnDefinition = "varchar(50)")
    private String EnfermedadPre;
    @Column(name="dosis", columnDefinition = "varchar(50)")
    private String Dosis;
    @Column(name="edad_frecuencia", columnDefinition = "varchar(50)")
    private String EdadFrecuencia;
    @Column(name="fecha_vacunacion", columnDefinition = "date")
    private Date FechaVacunacion;
    @Column(name="status", columnDefinition = "varchar(50)")
    private String Status;

    public Vacunas() {
    }

    public int getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(int idVacuna) {
        this.idVacuna = idVacuna;
    }

    public String getEnfermedadPre() {
        return EnfermedadPre;
    }

    public void setEnfermedadPre(String enfermedadPre) {
        EnfermedadPre = enfermedadPre;
    }

    public String getDosis() {
        return Dosis;
    }

    public void setDosis(String dosis) {
        Dosis = dosis;
    }

    public String getEdadFrecuencia() {
        return EdadFrecuencia;
    }

    public void setEdadFrecuencia(String edadFrecuencia) {
        EdadFrecuencia = edadFrecuencia;
    }

    public Date getFechaVacunacion() {
        return FechaVacunacion;
    }

    public void setFechaVacunacion(Date fechaVacunacion) {
        FechaVacunacion = fechaVacunacion;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}

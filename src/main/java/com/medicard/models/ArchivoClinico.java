package com.medicard.models;


import javax.persistence.*;

@Entity
@Table(name="archivoclinico")
public class ArchivoClinico {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="nss")
    private int NSS;
    @Column(name="idreceta")
    private int idReceta;
    @Column(name="idexamen")
    private int idExamen;
    @Column(name="idVacuna")
    private int idVacuna;

    public ArchivoClinico() {
    }

    public int getNSS() {
        return NSS;
    }

    public void setNSS(int NSS) {
        this.NSS = NSS;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public int getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(int idVacuna) {
        this.idVacuna = idVacuna;
    }
}

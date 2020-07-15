package com.medicard.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="nss")
    private int NSS;
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
    @Column(name="tipo_sangre", columnDefinition = "varchar(50)")
    private String TipoSangre;
    @Column(name="Alergias", columnDefinition = "varchar(50)")
    private String Alergias;
    @Column(name="curp", columnDefinition = "varchar(50)")
    private String CURP;
    @Column(name="clinica")
    private int Clinica;
    @Column(name="consultorio")
    private int Consultorio;
    @Column(name="calidad", columnDefinition = "varchar(50)")
    private String Calidad;
    @Column(name="peso")
    private double Peso;
    @Column(name="estatura")
    private double Estatura;

    public Paciente() {
    }

    public int getNSS() {
        return NSS;
    }

    public void setNSS(int NSS) {
        this.NSS = NSS;
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

    public String getTipoSangre() {
        return TipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        TipoSangre = tipoSangre;
    }

    public String getAlergias() {
        return Alergias;
    }

    public void setAlergias(String alergias) {
        Alergias = alergias;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public int getClinica() {
        return Clinica;
    }

    public void setClinica(int clinica) {
        Clinica = clinica;
    }

    public int getConsultorio() {
        return Consultorio;
    }

    public void setConsultorio(int consultorio) {
        Consultorio = consultorio;
    }

    public String getCalidad() {
        return Calidad;
    }

    public void setCalidad(String calidad) {
        Calidad = calidad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getEstatura() {
        return Estatura;
    }

    public void setEstatura(double estatura) {
        Estatura = estatura;
    }
}

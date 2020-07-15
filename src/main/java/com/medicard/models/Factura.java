package com.medicard.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idfactura")
    private int idFactura;
    @Column(name="nss")
    private int NSS;
    @Column(name="doctor")
    private String Doctor;
    @Column(name="total")
    private int Total;
    @Column(name="fecha_factura", columnDefinition = "date")
    private Date FechaFactura;
    @Column(name="hora_factura", columnDefinition = "varchar(50)")
    private String HoraFactura;
    @Column(name="nombre_medic", columnDefinition = "varchar(50)")
    private String NombreMedic;
    @Column(name="cantidad_medic")
    private int CantidadMedic;

    public Factura() {
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getNSS() {
        return NSS;
    }

    public void setNSS(int NSS) {
        this.NSS = NSS;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String doctor) {
        Doctor = doctor;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public Date getFechaFactura() {
        return FechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        FechaFactura = fechaFactura;
    }

    public String getHoraFactura() {
        return HoraFactura;
    }

    public void setHoraFactura(String horaFactura) {
        HoraFactura = horaFactura;
    }

    public String getNombreMedic() {
        return NombreMedic;
    }

    public void setNombreMedic(String nombreMedic) {
        NombreMedic = nombreMedic;
    }

    public int getCantidadMedic() {
        return CantidadMedic;
    }

    public void setCantidadMedic(int cantidadMedic) {
        CantidadMedic = cantidadMedic;
    }
}

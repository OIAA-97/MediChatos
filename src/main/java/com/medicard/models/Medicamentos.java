package com.medicard.models;


import javax.persistence.*;

@Entity
@Table(name="medicamentos")
public class Medicamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idMed")
    private int idMed;
    @Column(name="codigoBarra", columnDefinition = "varchar(50)")
    private String codigoBarra;
    @Column(name="nombremed", columnDefinition = "varchar(50)")
    private String NombreMed;
    @Column(name="presentacionmed")
    private int PresentacionMed;
    @Column(name="contenidomed")
    private int ContenidoMed;
    @Column(name="tipomed", columnDefinition = "varchar(50)")
    private String TipoMed;
    @Column(name="viaAdminmed", columnDefinition = "varchar(50)")
    private String ViaAdminMed;
    @Column(name="preciomed")
    private double PrecioMed;
    @Column(name="stockmed")
    private int stockMed;

    public Medicamentos() {
    }

    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getNombreMed() {
        return NombreMed;
    }

    public void setNombreMed(String nombreMed) {
        NombreMed = nombreMed;
    }

    public int getPresentacionMed() {
        return PresentacionMed;
    }

    public void setPresentacionMed(int presentacionMed) {
        PresentacionMed = presentacionMed;
    }

    public int getContenidoMed() {
        return ContenidoMed;
    }

    public void setContenidoMed(int contenidoMed) {
        ContenidoMed = contenidoMed;
    }

    public String getTipoMed() {
        return TipoMed;
    }

    public void setTipoMed(String tipoMed) {
        TipoMed = tipoMed;
    }

    public String getViaAdminMed() {
        return ViaAdminMed;
    }

    public void setViaAdminMed(String viaAdminMed) {
        ViaAdminMed = viaAdminMed;
    }

    public double getPrecioMed() {
        return PrecioMed;
    }

    public void setPrecioMed(double precioMed) {
        PrecioMed = precioMed;
    }

    public int getStockMed() {
        return stockMed;
    }

    public void setStockMed(int stockMed) {
        this.stockMed = stockMed;
    }
}

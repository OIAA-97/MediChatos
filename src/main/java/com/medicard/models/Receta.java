package com.medicard.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="receta")
public class Receta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idreceta")
    private int idReceta;
    @Column(name="medicamento", columnDefinition = "varchar(50)")
    private String Medicamento;
    @Column(name="cantidad_med")
    private int CantidadMedic;
    @Column(name="tiempo_med", columnDefinition = "varchar(50)")
    private String TiempoMed;
    @Column(name="dias_med", columnDefinition = "varchar(50)")
    private String DiasMed;
    @Column(name="fecha_consulta", columnDefinition = "date")
    private Date FechaConsulta;
    @Column(name="empleado")
    private int Empleado;
    @Column(name="total_med")
    private int TotalMed;

    public Receta() {
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public String getMedicamento() {
        return Medicamento;
    }

    public void setMedicamento(String medicamento) {
        Medicamento = medicamento;
    }

    public int getCantidadMedic() {
        return CantidadMedic;
    }

    public void setCantidadMedic(int cantidadMedic) {
        CantidadMedic = cantidadMedic;
    }

    public String getTiempoMed() {
        return TiempoMed;
    }

    public void setTiempoMed(String tiempoMed) {
        TiempoMed = tiempoMed;
    }

    public String getDiasMed() {
        return DiasMed;
    }

    public void setDiasMed(String diasMed) {
        DiasMed = diasMed;
    }

    public Date getFechaConsulta() {
        return FechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        FechaConsulta = fechaConsulta;
    }

    public int getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(int empleado) {
        Empleado = empleado;
    }

    public int getTotalMed() {
        return TotalMed;
    }

    public void setTotalMed(int totalMed) {
        TotalMed = totalMed;
    }
}

package com.medicard.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="examenlab")
public class ExamenLab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idexmane")
    private int idExamen;
    @Column(name="diagnostico", columnDefinition = "varchar(50)")
    private String Diagnostico;
    @Column(name="fecha_examen", columnDefinition = "date")
    private Date FechaExam;
    @Column(name="hora_examen", columnDefinition = "varchar(50)")
    private String HoraExam;
    @Column(name="lugar_examen", columnDefinition = "varchar(50)")
    private String LugarExam;
    @Column(name="tipo_examen", columnDefinition = "varchar(50)")
    private String TipoExamen;
    @Column(name="indicaciones", columnDefinition = "date")
    private String Indicaciones;

    public ExamenLab() {
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        Diagnostico = diagnostico;
    }

    public Date getFechaExam() {
        return FechaExam;
    }

    public void setFechaExam(Date fechaExam) {
        FechaExam = fechaExam;
    }

    public String getHoraExam() {
        return HoraExam;
    }

    public void setHoraExam(String horaExam) {
        HoraExam = horaExam;
    }

    public String getLugarExam() {
        return LugarExam;
    }

    public void setLugarExam(String lugarExam) {
        LugarExam = lugarExam;
    }

    public String getTipoExamen() {
        return TipoExamen;
    }

    public void setTipoExamen(String tipoExamen) {
        TipoExamen = tipoExamen;
    }

    public String getIndicaciones() {
        return Indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        Indicaciones = indicaciones;
    }
}

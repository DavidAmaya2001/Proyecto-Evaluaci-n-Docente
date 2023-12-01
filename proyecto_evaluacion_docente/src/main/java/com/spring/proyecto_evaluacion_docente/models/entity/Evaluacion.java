package com.spring.proyecto_evaluacion_docente.models.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;



@Entity
@Table(name = "evaluaciones")
public class Evaluacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "evaluaciones", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DetalleEvaluacion> detalleEvaluacions;

    @OneToMany(mappedBy = "evaluaciones", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Pregunta> preguntas;

    @OneToMany(mappedBy = "evaluaciones", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Respuesta> respuestas;

    @NotEmpty
    private String semestre;

    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha;

    @NotNull
    private Double calificacion_global;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<DetalleEvaluacion> getDetalleEvaluacions() {
        return detalleEvaluacions;
    }

    public void setDetalleEvaluacions(List<DetalleEvaluacion> detalleEvaluacions) {
        this.detalleEvaluacions = detalleEvaluacions;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    /*public void addItemFactura(ItemFactura item) {
		this.items.add(item);
	}*/

    public void addPreguntas(Pregunta pregunta){
        this.preguntas.add(pregunta);
    }

    public void addRespuestas(Respuesta respuesta){
        this.respuestas.add(respuesta);
    }

    public void addDetalleEvaluacion(DetalleEvaluacion detalleEvaluacion){
        this.detalleEvaluacions.add(detalleEvaluacion);
    }

    public List<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getCalificacion_global() {
        return calificacion_global;
    }

    public void setCalificacion_global(Double calificacion_global) {
        this.calificacion_global = calificacion_global;
    }

    @Override
    public String toString(){
        return semestre + " " + calificacion_global;
    }

    private static final long serialVersionUID = 1L;

    private static long getSerialVersionUID(){
        return serialVersionUID;
    }

}

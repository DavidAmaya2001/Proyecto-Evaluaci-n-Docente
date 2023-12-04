package com.spring.proyecto_evaluacion_docente.models.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "historial_docente")
public class HistorialDocente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "semestre")
    private String semestre;

    @Column(name = "califciacion_promedio")
    private Double califciacion_promedio;

    public HistorialDocente(Long id, String semestre, Double califciacion_promedio) {
        this.id = id;
        this.semestre = semestre;
        this.califciacion_promedio = califciacion_promedio;
    }

    public HistorialDocente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public Double getCalifciacion_promedio() {
        return califciacion_promedio;
    }

    public void setCalifciacion_promedio(Double califciacion_promedio) {
        this.califciacion_promedio = califciacion_promedio;
    }

    private static final long serialVersionUID = 1L;
}

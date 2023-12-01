package com.spring.proyecto_evaluacion_docente.models.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "cursos")
public class Curso implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String nombre_curso;

    @NotEmpty
    private String descripcion;

    @OneToMany(mappedBy = "cursos", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Calificacion> calificacions;

    @OneToMany(mappedBy = "cursos", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Evaluacion> evaluacions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Calificacion> getCalificacions() {
        return calificacions;
    }

    public void setCalificacions(List<Calificacion> calificacions) {
        this.calificacions = calificacions;
    }

    public List<Evaluacion> getEvaluacions() {
        return evaluacions;
    }

    public void setEvaluacions(List<Evaluacion> evaluacions) {
        this.evaluacions = evaluacions;
    }

    @Override
    public String toString(){
        return nombre_curso + " " +descripcion;
    };

    private static final long serialVersionUID = 1L;

    private static long getSerialVersionUID(){
        return serialVersionUID;
    }
}

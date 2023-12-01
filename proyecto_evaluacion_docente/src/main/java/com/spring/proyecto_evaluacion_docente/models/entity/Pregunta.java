package com.spring.proyecto_evaluacion_docente.models.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;

@Entity
@Table(name = "preguntas")
public class Pregunta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String preguntas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(String preguntas) {
        this.preguntas = preguntas;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "preguntas='" + preguntas + '\'' + '}';
    }

    private static final long serialVersionUID = 1L;

    private static long getSerialVersionUID(){
        return serialVersionUID;
    }
}

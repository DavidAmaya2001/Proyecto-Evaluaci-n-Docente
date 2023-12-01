package com.spring.proyecto_evaluacion_docente.models.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;

@Entity
@Table(name = "calificaciones")
public class Calificacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String calificacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    private static long getSerialVersionUID(){
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Calificacion{" + "calificacion='" + calificacion + '\'' + '}';
    }

    private static final long serialVersionUID = 1L;
}

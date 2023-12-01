package com.spring.proyecto_evaluacion_docente.models.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;

@Entity
@Table(name = "detalles_evaluacion")
public class DetalleEvaluacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String comentarios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public static final long serialVersionUID = 1L;

    public static long getSerialVersionUID(){
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "DetalleEvaluacion{" +
                "comentarios='" + comentarios + '\'' +
                '}';
    }
}

package com.spring.proyecto_evaluacion_docente.models.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;

@Entity
@Table(name = "respuestas")
public class Respuesta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String respuesta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public static long getSerialVersionUID(){
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Respuesta{" +
                "respuesta='" + respuesta + '\'' +
                '}';
    }

    public static final long serialVersionUID = 1L;
}

package com.spring.proyecto_evaluacion_docente.models.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;

@Entity
@Table(name = "estudiantes")
public class Estudiantes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String user;

    @NotEmpty
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private static long getSerialVersionUID(){
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return user + " "+ password;
    }

    private static final long serialVersionUID = 1L;
}

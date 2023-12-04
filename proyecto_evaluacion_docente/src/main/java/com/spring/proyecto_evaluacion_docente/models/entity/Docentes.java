package com.spring.proyecto_evaluacion_docente.models.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "docente")
public class Docentes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String user;

    @NotEmpty
    private String password;

    @OneToMany(mappedBy = "docente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<HistorialDocente> historialDocentes;

    public Docentes(Long id, String user, String password, List<HistorialDocente> historialDocentes) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.historialDocentes = historialDocentes;
    }

    public Docentes() {
    }

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

    public List<HistorialDocente> getHistorialDocentes() {
        return historialDocentes;
    }

    public void setHistorialDocentes(List<HistorialDocente> historialDocentes) {
        this.historialDocentes = historialDocentes;
    }

    public void addHistorialDocente(HistorialDocente historialDocente){
        historialDocentes.add(historialDocente);
    }

    public static long getSerialVersionUID(){
        return serialVersionUID;
    }

    @Override
    public String toString(){
        return user + " " + password;
    }

    private static final long serialVersionUID = 1L;
}

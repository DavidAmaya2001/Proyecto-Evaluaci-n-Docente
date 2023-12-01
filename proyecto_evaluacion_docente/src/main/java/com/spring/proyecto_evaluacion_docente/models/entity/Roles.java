package com.spring.proyecto_evaluacion_docente.models.entity;

import jakarta.persistence.*;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.data.relational.core.sql.In;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "roles")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Roles  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy ="roles", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private List<Estudiantes> estudiantes;

    @OneToMany(mappedBy ="roles", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private List<Docentes> docentes;

    @OneToMany(mappedBy ="roles", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private List<Administracion> administracions;

    @OneToMany(mappedBy ="roles", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private List<Curso> cursos;

    public Roles(){
    }

    public Roles(Integer id, List<Estudiantes> estudiantes, List<Docentes> docentes, List<Administracion> administracions, List<Curso> cursos) {
        this.id = id;
        this.estudiantes = estudiantes;
        this.docentes = docentes;
        this.administracions = administracions;
        this.cursos = cursos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Estudiantes> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Docentes> getDocentes() {
        return docentes;
    }

    public void setDocentes(List<Docentes> docentes) {
        this.docentes = docentes;
    }

    public List<Administracion> getAdministracions() {
        return administracions;
    }

    public void setAdministracions(List<Administracion> administracions) {
        this.administracions = administracions;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "id=" + id +
                ", estudiantes=" + estudiantes +
                ", docentes=" + docentes +
                ", administracions=" + administracions +
                ", cursos=" + cursos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Roles roles = (Roles) o;
        return Objects.equals(id, roles.id) && Objects.equals(estudiantes, roles.estudiantes) && Objects.equals(docentes, roles.docentes) && Objects.equals(administracions, roles.administracions) && Objects.equals(cursos, roles.cursos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, estudiantes, docentes, administracions, cursos);
    }
}

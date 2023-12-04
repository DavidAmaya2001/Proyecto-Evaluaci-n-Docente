package com.spring.proyecto_evaluacion_docente.servicios.dao;

import com.spring.proyecto_evaluacion_docente.models.entity.Docentes;

import java.util.Optional;

public interface IDocentesDao{
    Iterable<Docentes> findDocentesByCurso(String user, String cursos);
    Optional<Docentes> buscarPorUserDocente(String user);

    Optional<Docentes> buscarDocentePorId(Long id);
}

package com.spring.proyecto_evaluacion_docente.servicios.dao;

import com.spring.proyecto_evaluacion_docente.models.entity.Estudiantes;
import com.spring.proyecto_evaluacion_docente.repository.EstudiantesRepository;

import java.util.Optional;

public interface IEstudiantesDao extends RolesDao {

    Optional<Estudiantes> buscarEstudiantePorId(Long id);
    Optional<Estudiantes> buscarEstudiantePorUser(String user);
}

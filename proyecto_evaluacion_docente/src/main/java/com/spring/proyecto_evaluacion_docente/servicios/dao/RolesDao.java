package com.spring.proyecto_evaluacion_docente.servicios.dao;

import com.spring.proyecto_evaluacion_docente.models.entity.Docentes;
import com.spring.proyecto_evaluacion_docente.models.entity.Estudiantes;
import com.spring.proyecto_evaluacion_docente.models.entity.Roles;

import java.util.Optional;

public interface RolesDao extends GenericoDAO<Roles> {
    Optional<Roles> buscarPorId(Long id);
    Optional<Docentes> buscarDocentePorUser(String user);

    Optional<Estudiantes> buscarEstudiantePorUser(String user);
}

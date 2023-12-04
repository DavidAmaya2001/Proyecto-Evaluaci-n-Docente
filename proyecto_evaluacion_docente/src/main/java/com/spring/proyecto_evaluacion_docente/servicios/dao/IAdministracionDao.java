package com.spring.proyecto_evaluacion_docente.servicios.dao;

import com.spring.proyecto_evaluacion_docente.models.entity.*;

import java.util.Optional;

public interface IAdministracionDao {

    Iterable<Roles> buscarEstudiantesPorNombreCurso(String nombre_curso);
    Optional<Roles> buscarEstudiantePorId(Long id);

    Optional<Roles> buscarDoscentePorNombre(String user, String nombre_curso, String semestre);
    Optional<Roles> buscarPorIdDocentes(Long id);

    Optional<Roles> buscarPorEvaluacion(String semestre);

}

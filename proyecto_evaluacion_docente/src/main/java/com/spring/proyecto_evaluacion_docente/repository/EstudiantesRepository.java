package com.spring.proyecto_evaluacion_docente.repository;

import com.spring.proyecto_evaluacion_docente.models.entity.Estudiantes;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("estudianteRepository")
public interface EstudiantesRepository extends RolesRepository {

    @Query("select user from estudiantes")
    Optional<Estudiantes> buscarEstudiantePorUser(String user);

    @Query("SELECT id FROM estudiantes")
    Optional<Estudiantes> buscarEstudiantePorId(Long id);

}

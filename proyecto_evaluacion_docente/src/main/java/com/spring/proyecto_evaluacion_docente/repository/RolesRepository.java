package com.spring.proyecto_evaluacion_docente.repository;

import com.spring.proyecto_evaluacion_docente.models.entity.Docentes;
import com.spring.proyecto_evaluacion_docente.models.entity.Estudiantes;
import com.spring.proyecto_evaluacion_docente.models.entity.Roles;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface RolesRepository extends CrudRepository<Roles, Integer> {

    @Query("select docente.user from evaluaciondb.docente JOIN evaluaciondb.roles ON docente.id = roles.id_docente")
    Optional<Docentes> buscarDocentePorUser(String user);

    @Query("select estudiantes.user from evaluaciondb.estudiantes JOIN evaluaciondb.roles ON estudiantes.id = roles.id_estudiante")
    Optional<Estudiantes> buscarEstudiantePorUser(String user);
}

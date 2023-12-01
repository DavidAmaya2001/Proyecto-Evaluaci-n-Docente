package com.spring.proyecto_evaluacion_docente.repository;

import com.spring.proyecto_evaluacion_docente.models.entity.Docentes;
import com.spring.proyecto_evaluacion_docente.models.entity.Estudiantes;
import com.spring.proyecto_evaluacion_docente.models.entity.Roles;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("docenteRepository")
public interface DocentesRepository extends RolesRepository {

    @Query("select docente.user from docente JOIN roles ON docente.id = roles.id_docente")
    Optional<Roles> buscarDocentePorUser(String user);

    @Query("SELECT user FROM docente where id = ?1")
    Optional<Docentes> buscarDocenteId(Long id);

    @Query("select docente.user, cursos.nombre_curso from docente JOIN cursos ON docente.id = cursos.id;")
    Iterable<Docentes> findDocentesByCurso(String user, String cursos);
}

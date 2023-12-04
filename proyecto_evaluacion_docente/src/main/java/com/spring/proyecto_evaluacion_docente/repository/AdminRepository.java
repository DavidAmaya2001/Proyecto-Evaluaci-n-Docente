package com.spring.proyecto_evaluacion_docente.repository;
import com.spring.proyecto_evaluacion_docente.models.entity.Roles;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends RolesRepository{

    @Query("select estudiantes.user, cursos.nombre_curso from evaluaciondb.estudiantes join evaluaciondb.roles on estudiantes.id = roles.id_estudiante join evaluaciondb.cursos on roles.id_curso = cursos.id")
    Iterable<Roles> buscarEstudiantesPorNombreCurso(String nombre_curso);

    @Query("select id from evaluaciondb.estudiantes")
    Optional<Roles> buscarEstudiantePorId(Long id);

    @Query("SELECT docente.user, cursos.nombre_curso, evaluaciones.semestre FROM evaluaciondb.docente JOIN evaluaciondb.roles ON docente.id = roles.id_docente JOIN evaluaciondb.cursos ON roles.id_curso = cursos.id JOIN evaluaciondb.evaluaciones ON cursos.id_evaluacion = evaluaciones.id")
    Optional<Roles> buscarDocentePorNombre(String user, String nombre_curso, String semestre);

    @Query("select id from evaluaciondb.docente")
    Optional<Roles> buscarPorIdDocente(Long id);

    @Query("SELECT docente.user, cursos.nombre_curso, evaluaciones.semestre FROM evaluaciondb.docente JOIN evaluaciondb.roles ON docente.id = roles.id_docente JOIN evaluaciondb.cursos ON roles.id_curso = cursos.id JOIN evaluaciondb.evaluaciones ON cursos.id_evaluacion = evaluaciones.id;")
    Optional<Roles> buscarPorEvaluacion(String semestre);
}

package com.spring.proyecto_evaluacion_docente.servicios.dao;

import com.spring.proyecto_evaluacion_docente.models.entity.Curso;
import com.spring.proyecto_evaluacion_docente.models.entity.Evaluacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IEvaluacionDao extends GenericoDAO<Curso> {
    Iterable<Curso> findCursoByNombreCurso(String nombre_curso);
    Iterable<Curso> findCursoByNombreCursoIgnoreCase(String nombre_curso);
    Iterable<Curso> findCursoByIdCurso(Long id);
}

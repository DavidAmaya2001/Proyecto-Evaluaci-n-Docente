package com.spring.proyecto_evaluacion_docente.servicios.dao;

import com.spring.proyecto_evaluacion_docente.models.entity.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICursoDao extends  GenericoDAO<Curso> {

    Iterable<Curso> findCursoByNombre(String nombre_curso);
    Iterable<Curso> findCursoByNombreConstainsIgnoreCase(String nombre_curso);

}

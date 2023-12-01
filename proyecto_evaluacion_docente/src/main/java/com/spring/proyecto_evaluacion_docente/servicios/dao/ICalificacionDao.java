package com.spring.proyecto_evaluacion_docente.servicios.dao;

import com.spring.proyecto_evaluacion_docente.models.entity.Calificacion;
import com.spring.proyecto_evaluacion_docente.models.entity.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICalificacionDao {

    Iterable<Curso> findCalificacionById(Long id);
    Iterable<Curso> findCalificacionByCalificacion(String calificacion);
}

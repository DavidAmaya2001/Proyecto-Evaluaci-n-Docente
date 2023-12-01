package com.spring.proyecto_evaluacion_docente.servicios.dao;

import com.spring.proyecto_evaluacion_docente.models.entity.Pregunta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IPreguntaDao extends GenericoDAO<Pregunta>{
    Iterable<Pregunta> findPreguntaByIdPregunta(Long id);
    Iterable<Pregunta> findPreguntaByPregunta(String pregunta);
}

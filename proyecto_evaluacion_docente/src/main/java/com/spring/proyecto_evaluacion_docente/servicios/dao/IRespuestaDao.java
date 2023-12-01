package com.spring.proyecto_evaluacion_docente.servicios.dao;

import com.spring.proyecto_evaluacion_docente.models.entity.Pregunta;
import com.spring.proyecto_evaluacion_docente.models.entity.Respuesta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IRespuestaDao extends GenericoDAO<Respuesta> {

    Iterable<Respuesta> findRespuestaById(Long id);
    Iterable<Respuesta> findRespuestaByRespuesta(String respuesta);

}

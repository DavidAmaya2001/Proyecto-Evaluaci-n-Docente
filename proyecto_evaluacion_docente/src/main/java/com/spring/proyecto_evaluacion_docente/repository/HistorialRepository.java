package com.spring.proyecto_evaluacion_docente.repository;

import com.spring.proyecto_evaluacion_docente.models.entity.HistorialDocente;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HistorialRepository extends DocentesRepository{
    @Query("SELECT docente.id, docente.user, historial_docente.semestre, historial_docente.califiacion_promedio FROM evaluaciondb.docente join evaluaciondb.historial_docente on historial_docente.id = docente.id_historial")
    Optional<HistorialDocente> buscarPorHitorialDocente(String user, String semestre, Double califciacion_promedio);
}

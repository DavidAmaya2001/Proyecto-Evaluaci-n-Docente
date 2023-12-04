package com.spring.proyecto_evaluacion_docente.servicios.dao;

import com.spring.proyecto_evaluacion_docente.models.entity.Docentes;
import com.spring.proyecto_evaluacion_docente.models.entity.HistorialDocente;

import java.util.Optional;

public interface IHistorialDocenteDao {
    Optional<HistorialDocente> buscarPorHitorialDocente(String user, String semestre, Double califciacion_promedio);
}

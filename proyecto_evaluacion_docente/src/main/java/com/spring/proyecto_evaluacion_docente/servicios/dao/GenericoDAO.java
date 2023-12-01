package com.spring.proyecto_evaluacion_docente.servicios.dao;

import java.util.Optional;

public interface GenericoDAO <E>{
    Optional <E> findById(Long id);

    E save(E entidad);

    Iterable<E> findAll();

    void deleteById(Long id);
}

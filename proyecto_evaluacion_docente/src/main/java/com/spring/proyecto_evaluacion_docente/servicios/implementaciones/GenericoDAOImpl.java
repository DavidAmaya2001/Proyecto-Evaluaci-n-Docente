package com.spring.proyecto_evaluacion_docente.servicios.implementaciones;

import com.spring.proyecto_evaluacion_docente.servicios.dao.GenericoDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class GenericoDAOImpl <E, R extends CrudRepository<E, Integer>> implements GenericoDAO<E> {

    protected final R repository;

    public GenericoDAOImpl(R repository){
        this.repository = repository;
    }


    @Override
    public Optional<E> findById(Long id) {
        return Optional.empty();
    }

    @Override
    @Transactional
    public E save(E entidad){
        return repository.save(entidad);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<E> findAll(){
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {

    }

}

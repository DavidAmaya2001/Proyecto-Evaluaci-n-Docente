package com.spring.proyecto_evaluacion_docente.servicios.implementaciones;

import com.spring.proyecto_evaluacion_docente.models.entity.Docentes;
import com.spring.proyecto_evaluacion_docente.repository.DocentesRepository;
import com.spring.proyecto_evaluacion_docente.repository.RolesRepository;
import com.spring.proyecto_evaluacion_docente.servicios.dao.IDocentesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public abstract class DocenteDaoImpl extends RolesDaoImpl implements IDocentesDao {

    @Autowired
    public DocenteDaoImpl(@Qualifier("docenteRepository")RolesRepository repository){
        super(repository);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Docentes> findDocentesByCurso(String user, String cursos) {
        return ((DocentesRepository)repository).findDocentesByCurso(user, cursos);
    }


    @Override
    public Optional<Docentes> buscarPorUserDocente(String user) {
        return ((DocentesRepository)repository).buscarDocentePorUser(user);
    }

    @Override
    public Optional<Docentes> buscarDocentePorId(Long id) {
        return ((DocentesRepository)repository).buscarDocenteId(id);
    }


}

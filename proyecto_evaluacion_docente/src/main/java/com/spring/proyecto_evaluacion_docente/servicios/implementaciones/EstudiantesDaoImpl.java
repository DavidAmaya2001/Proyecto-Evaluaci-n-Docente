package com.spring.proyecto_evaluacion_docente.servicios.implementaciones;

import com.spring.proyecto_evaluacion_docente.models.entity.Estudiantes;
import com.spring.proyecto_evaluacion_docente.repository.EstudiantesRepository;
import com.spring.proyecto_evaluacion_docente.repository.RolesRepository;
import com.spring.proyecto_evaluacion_docente.servicios.dao.IEstudiantesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public abstract class EstudiantesDaoImpl extends RolesDaoImpl implements IEstudiantesDao {


    @Autowired
    public EstudiantesDaoImpl(@Qualifier("estudianteRepository")RolesRepository repository) {
        super(repository);
    }


    @Override
    public Optional<Estudiantes> buscarEstudiantePorId(Long id) {
        return ((EstudiantesRepository)repository).buscarEstudiantePorId(id);
    }

    @Override
    public Optional<Estudiantes> buscarEstudiantePorUser(String user) {
        return repository.buscarEstudiantePorUser(user);
    }

}

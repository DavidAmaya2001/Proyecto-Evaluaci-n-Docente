package com.spring.proyecto_evaluacion_docente.servicios.implementaciones;

import com.spring.proyecto_evaluacion_docente.models.entity.Estudiantes;
import com.spring.proyecto_evaluacion_docente.models.entity.Roles;
import com.spring.proyecto_evaluacion_docente.servicios.dao.RolesDao;
import com.spring.proyecto_evaluacion_docente.repository.RolesRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public abstract class RolesDaoImpl extends GenericoDAOImpl<Roles, RolesRepository> implements RolesDao {

    public RolesDaoImpl(RolesRepository repository){
        super(repository);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<Roles> buscarPorId(Long id) {
        return Optional.empty();
    }


}


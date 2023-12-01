package com.spring.proyecto_evaluacion_docente.servicios.implementaciones;

import com.spring.proyecto_evaluacion_docente.models.entity.Docentes;
import com.spring.proyecto_evaluacion_docente.models.entity.Estudiantes;
import com.spring.proyecto_evaluacion_docente.models.entity.Evaluacion;
import com.spring.proyecto_evaluacion_docente.models.entity.Roles;
import com.spring.proyecto_evaluacion_docente.repository.RolesRepository;
import com.spring.proyecto_evaluacion_docente.servicios.dao.IAdministracionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Optional;

public class AdministracionDaoImpl extends RolesDaoImpl implements IAdministracionDao {


    public AdministracionDaoImpl(@Qualifier("adminRepository")RolesRepository repository){
        super(repository);
    }

}

package com.spring.proyecto_evaluacion_docente.servicios.implementaciones;

import com.spring.proyecto_evaluacion_docente.models.entity.Docentes;
import com.spring.proyecto_evaluacion_docente.models.entity.Estudiantes;
import com.spring.proyecto_evaluacion_docente.models.entity.HistorialDocente;
import com.spring.proyecto_evaluacion_docente.repository.DocentesRepository;
import com.spring.proyecto_evaluacion_docente.repository.HistorialRepository;
import com.spring.proyecto_evaluacion_docente.repository.RolesRepository;
import com.spring.proyecto_evaluacion_docente.servicios.dao.IHistorialDocenteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HistorialDocenteDaoImpl extends RolesDaoImpl implements IHistorialDocenteDao {

    @Autowired
    public HistorialDocenteDaoImpl(@Qualifier("historialRepository")RolesRepository repository){
        super(repository);
    }

    @Override
    public Optional<HistorialDocente> buscarPorHitorialDocente(String user, String semestre, Double califciacion_promedio) {
        return ((HistorialRepository)repository).buscarPorHitorialDocente(user, semestre, califciacion_promedio);
    }

}

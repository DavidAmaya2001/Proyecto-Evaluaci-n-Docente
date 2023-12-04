package com.spring.proyecto_evaluacion_docente.servicios.implementaciones;

import com.spring.proyecto_evaluacion_docente.models.entity.Docentes;
import com.spring.proyecto_evaluacion_docente.models.entity.Estudiantes;
import com.spring.proyecto_evaluacion_docente.models.entity.Roles;
import com.spring.proyecto_evaluacion_docente.repository.AdminRepository;
import com.spring.proyecto_evaluacion_docente.repository.RolesRepository;
import com.spring.proyecto_evaluacion_docente.servicios.dao.IAdministracionDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdministracionDaoImpl extends RolesDaoImpl implements IAdministracionDao {



    public AdministracionDaoImpl(@Qualifier("adminRepository")RolesRepository repository){
        super(repository);
    }

    @Override
    public Iterable<Roles> buscarEstudiantesPorNombreCurso(String nombre_curso) {
        return ((AdminRepository)repository).buscarEstudiantesPorNombreCurso(nombre_curso);
    }

    @Override
    public Optional<Roles> buscarEstudiantePorId(Long id) {
        return ((AdminRepository)repository).buscarEstudiantePorId(id);
    }

    @Override
    public Optional<Roles> buscarDoscentePorNombre(String user, String nombre_curso, String semestre) {
        return ((AdminRepository)repository).buscarDocentePorNombre(user, nombre_curso, semestre);
    }

    @Override
    public Optional<Roles> buscarPorIdDocentes(Long id) {
        return ((AdminRepository)repository).buscarPorIdDocente(id);
    }

    @Override
    public Optional<Roles> buscarPorEvaluacion(String semestre) {
        return ((AdminRepository)repository).buscarPorEvaluacion(semestre);
    }

    @Override
    public Optional<Docentes> buscarDocentePorUser(String user) {
        return repository.buscarDocentePorUser(user);
    }

    @Override
    public Optional<Estudiantes> buscarEstudiantePorUser(String user) {
        return repository.buscarEstudiantePorUser(user);
    }
}

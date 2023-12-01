package com.spring.proyecto_evaluacion_docente.repository;

import com.spring.proyecto_evaluacion_docente.models.entity.Estudiantes;
import com.spring.proyecto_evaluacion_docente.models.entity.Roles;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface RolesRepository extends CrudRepository<Roles, Integer> {



    @Query("select estudiantes.user from estudiantes JOIN roles ON estudiantes.id = roles.id_estudiante")
    Optional<Estudiantes> buscarEstudiantePorUser(String user);
}

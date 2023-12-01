package com.spring.proyecto_evaluacion_docente.servicios.dao;

import com.spring.proyecto_evaluacion_docente.models.entity.Administracion;
import com.spring.proyecto_evaluacion_docente.models.entity.Docentes;
import com.spring.proyecto_evaluacion_docente.models.entity.Estudiantes;
import com.spring.proyecto_evaluacion_docente.models.entity.Evaluacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface IAdministracionDao {

    Iterable<Estudiantes> buscarEstudiantesPorNombreCurso(String nombre_curso);
    Optional<Estudiantes> buscarEstudiantePorId(Long id);

    Optional<Docentes> buscarDoscentePorNombre(String user);
    Optional<Docentes> buscarPorIdDocentes(Long id);

    Optional<Evaluacion> buscarPorEvaluacion(Long id);

}

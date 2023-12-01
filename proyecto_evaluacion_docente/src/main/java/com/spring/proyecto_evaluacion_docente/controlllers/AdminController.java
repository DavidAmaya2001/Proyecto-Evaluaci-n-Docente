package com.spring.proyecto_evaluacion_docente.controlllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("administracion")
public class AdminController {

    /*@Autowired
    private Estudiantes estudiantes;



    @Autowired
    private DocenteRepository docenteRepository;

    @Autowired
    private CursoRepository cursoRepository;

    // Funciones para eliminar

    @DeleteMapping("/alumnos/{id}")
    public ResponseEntity<Void> eliminarAlumno(@PathVariable Long id) {
        alumnoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/estudiantes/{id}")
    public ResponseEntity<Void> eliminarEstudiante(@PathVariable Long id) {
        estudianteRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/docentes/{id}")
    public ResponseEntity<Void> eliminarDocente(@PathVariable Long id) {
        docenteRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/cursos/{id}")
    public ResponseEntity<Void> eliminarCurso(@PathVariable Long id) {
        cursoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    // Funciones para crear

    @PostMapping("/alumnos")
    public ResponseEntity<Alumno> crearAlumno(@RequestBody Alumno alumno) {
        Alumno nuevoAlumno = alumnoRepository.save(alumno);
        return new ResponseEntity<>(nuevoAlumno, HttpStatus.CREATED);
    }

    @PostMapping("/estudiantes")
    public ResponseEntity<Estudiante> crearEstudiante(@RequestBody Estudiante estudiante) {
        Estudiante nuevoEstudiante = estudianteRepository.save(estudiante);
        return new ResponseEntity<>(nuevoEstudiante, HttpStatus.CREATED);
    }

    @PostMapping("/docentes")
    public ResponseEntity<Docente> crearDocente(@RequestBody Docente docente) {
        Docente nuevoDocente = docenteRepository.save(docente);
        return new ResponseEntity<>(nuevoDocente, HttpStatus.CREATED);
    }

    @PostMapping("/cursos")
    public ResponseEntity<Curso> crearCurso(@RequestBody Curso curso) {
        Curso nuevoCurso = cursoRepository.save(curso);
        return new ResponseEntity<>(nuevoCurso, HttpStatus.CREATED);
    }

    // Funciones para modificar

    @PutMapping("/alumnos/{id}")
    public ResponseEntity<Alumno> modificarAlumno(@PathVariable Long id, @RequestBody Alumno alumno) {
        if (!alumnoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        alumno.setId(id);
        Alumno alumnoModificado = alumnoRepository.save(alumno);
        return ResponseEntity.ok(alumnoModificado);
    }

    @PutMapping("/estudiantes/{id}")
    public ResponseEntity<Estudiante> modificarEstudiante(@PathVariable Long id, @RequestBody Estudiante estudiante) {
        // Lógica similar a la función de modificarAlumno
    }

    @PutMapping("/docentes/{id}")
    public ResponseEntity<Docente> modificarDocente(@PathVariable Long id, @RequestBody Docente docente) {
        // Lógica similar a la función de modificarAlumno
    }

    @PutMapping("/cursos/{id}")
    public ResponseEntity<Curso> modificarCurso(@PathVariable Long id, @RequestBody Curso curso) {
        // Lógica similar a la función de modificarAlumno
    }

    // Funciones para listar

    @GetMapping("/alumnos")
    public List<Alumno> listarAlumnos() {
        return alumnoRepository.findAll();
    }

    @GetMapping("/estudiantes")
    public List<Estudiante> listarEstudiantes() {
        return estudianteRepository.findAll();
    }

    @GetMapping("/docentes")
    public List<Docente> listarDocentes() {
        return docenteRepository.findAll();
    }

    @GetMapping("/cursos")
    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }*/
}

package com.spring.proyecto_evaluacion_docente.comandos;

import com.spring.proyecto_evaluacion_docente.models.entity.*;

public class ObjetosDummy {

    public static Estudiantes getEstudiante1(){
        return new Estudiantes(null, "juan", "123");
    }

    public static Docentes getDocente1(){
        return new Docentes(null, "guzman", "guzman");
    }

    public static HistorialDocente getHistorial1(){
        return new HistorialDocente(null, "segundo", 7.5);
    }

}

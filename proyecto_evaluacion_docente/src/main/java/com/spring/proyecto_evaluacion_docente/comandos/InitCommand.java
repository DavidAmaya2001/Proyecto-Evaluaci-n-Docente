package com.spring.proyecto_evaluacion_docente.comandos;

import com.spring.proyecto_evaluacion_docente.servicios.dao.RolesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class InitCommand implements CommandLineRunner {

    @Autowired
    @Qualifier(value = "estudiantesDaoImpl")
    private RolesDao servicioEstudiante;


    @Override
    public void run(String... args) throws Exception {

    }
}

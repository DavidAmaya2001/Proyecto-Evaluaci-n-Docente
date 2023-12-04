package com.spring.proyecto_evaluacion_docente.comandos;

import com.spring.proyecto_evaluacion_docente.servicios.dao.RolesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class InitCommand implements CommandLineRunner {

    @Autowired
    @Qualifier(value = "estudiantesDaoImpl")
    private RolesDao servicioEstudiante;

    @Autowired
    @Qualifier(value = "administracionDaoImpl")
    private RolesDao servicioAdministracion;

    @Autowired
    @Qualifier(value = "docenteDaoImpl")
    private RolesDao servicioDocente;

    @Autowired
    @Qualifier(value = "historialDocenteDaoImpl")
    private RolesDao servicioHistorial;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("************************  INIT COMMAND  ******************************");
        servicioEstudiante.save(ObjetosDummy.getEstudiante1());
        servicioDocente.save(ObjetosDummy.getDocente1());
        servicioHistorial.save(ObjetosDummy.getHistorial1());
    }
}

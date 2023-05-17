package com.softtek.spring_web_17052023.controller;

import com.softtek.spring_web_17052023.models.service.IPacienteServicio;
import com.softtek.spring_web_17052023.models.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteControlador {

    @Autowired
    IPacienteServicio servicio;

    @GetMapping("/paciente")
    public String obtenerUno(@Autowired Paciente paciente){
        paciente.setIdPaciente(3);
        paciente.setNombre("Pepe");
        paciente.setEdad(34);
        return servicio.obtenerUno(paciente);
    }
}

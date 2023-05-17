package com.softtek.spring_web_17052023.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Setter
@Getter
@Component
public class Paciente {
    private int idPaciente;
    private String nombre;
    private int edad;
}

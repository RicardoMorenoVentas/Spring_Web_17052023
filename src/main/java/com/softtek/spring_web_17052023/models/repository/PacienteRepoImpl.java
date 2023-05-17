package com.softtek.spring_web_17052023.models.repository;

import com.softtek.spring_web_17052023.models.Paciente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@NoArgsConstructor
@Repository
public class PacienteRepoImpl implements IPacienteRepo {
    @Override
    public String obtenerUno(Paciente p1) {
        return String.format("<h1>El paciente con ID %d tiene el nombre %s y tiene %d años</h1>",p1.getIdPaciente(),p1.getNombre(),p1.getEdad());
    }
}

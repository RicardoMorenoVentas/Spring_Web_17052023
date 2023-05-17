package com.softtek.spring_web_17052023.models.service;

import com.softtek.spring_web_17052023.models.repository.IPacienteRepo;
import com.softtek.spring_web_17052023.models.Paciente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Service
public class PacienteServicioImp implements IPacienteServicio {

    @Autowired
    IPacienteRepo repo;

    @Override
    public String obtenerUno(Paciente p1) {
        return repo.obtenerUno(p1);
    }
}

package edu.utp.pe.Diseno_Patrones.service;

import edu.utp.pe.Diseno_Patrones.modelo.Persona;
import java.util.List;

public interface PersonaService {
    Persona guardar(Persona persona);
    List<Persona> listar();
    Persona buscarPorId(Long id);
    void eliminar(Long id);
}

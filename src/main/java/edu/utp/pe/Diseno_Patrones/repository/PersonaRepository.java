package edu.utp.pe.Diseno_Patrones.repository;

import edu.utp.pe.Diseno_Patrones.modelo.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaRepository {

    Persona save(Persona persona);

    List<Persona> findAll();

    Optional<Persona> findById(Long id);

    void delete(Persona persona);
}

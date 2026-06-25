package edu.utp.pe.Diseno_Patrones.service.impl;

import edu.utp.pe.Diseno_Patrones.exception.RecursoNoEncontradoException;
import edu.utp.pe.Diseno_Patrones.modelo.Persona;
import edu.utp.pe.Diseno_Patrones.repository.PersonaRepository;
import edu.utp.pe.Diseno_Patrones.service.PersonaService;
import edu.utp.pe.Diseno_Patrones.validacion.PersonaValidador;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class PersonaServiceImpl implements PersonaService {
    private final PersonaRepository repository;
    private final PersonaValidador validador;

    public PersonaServiceImpl(PersonaRepository repository, PersonaValidador validador) {
        this.repository = repository;
        this.validador = validador;
    }

    @Override
    public Persona guardar(Persona persona) {
        log.info("Guardando persona: {}", persona.getNombres());
        validador.validar(persona);
        return repository.save(persona);
    }

    @Override
    public List<Persona> listar() {
        log.info("Listando personas");
        return repository.findAll();
    }

    @Override
    public Persona buscarPorId(Long id) {
        log.info("Buscando persona con id: {}", id);
        return repository.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException("Persona no encontrada"));
    }

    @Override
    public void eliminar(Long id) {
        log.info("Eliminando persona con id: {}", id);
        repository.delete(buscarPorId(id));
    }
}

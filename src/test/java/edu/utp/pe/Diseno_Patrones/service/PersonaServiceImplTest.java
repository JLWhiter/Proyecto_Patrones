package edu.utp.pe.Diseno_Patrones.service;

import edu.utp.pe.Diseno_Patrones.modelo.Persona;
import edu.utp.pe.Diseno_Patrones.repository.PersonaRepository;
import edu.utp.pe.Diseno_Patrones.service.impl.PersonaServiceImpl;
import edu.utp.pe.Diseno_Patrones.validacion.PersonaValidador;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class PersonaServiceImplTest {

    @Test
    void debeGuardarYListar() {
        log.info("Iniciando prueba: debeGuardarYListar");

        PersonaRepository repository = new PersonaRepositoryFake();
        PersonaService service = new PersonaServiceImpl(repository, new PersonaValidador());
        Persona persona = new Persona("Jose", "Chamorro", "correo@test.com", "999999999");

        assertSame(persona, service.guardar(persona));
        assertEquals(1, service.listar().size());
    }

    @Test
    void debeBuscarPorId() {
        log.info("Iniciando prueba: debeBuscarPorId");

        PersonaRepository repository = new PersonaRepositoryFake();
        PersonaService service = new PersonaServiceImpl(repository, new PersonaValidador());
        Persona persona = new Persona("Jose", "Chamorro", "correo@test.com", "999999999");
        service.guardar(persona);

        assertSame(persona, service.buscarPorId(1L));
    }

    static class PersonaRepositoryFake implements PersonaRepository {
        private final List<Persona> personas = new ArrayList<>();

        @Override
        public Persona save(Persona persona) {
            personas.add(persona);
            return persona;
        }

        @Override
        public List<Persona> findAll() {
            return personas;
        }

        @Override
        public Optional<Persona> findById(Long id) {
            if (personas.isEmpty()) {
                return Optional.empty();
            }
            return Optional.of(personas.get(0));
        }

        @Override
        public void delete(Persona persona) {
            personas.remove(persona);
        }
    }
}

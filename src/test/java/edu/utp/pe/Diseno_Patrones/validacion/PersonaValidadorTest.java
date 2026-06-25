package edu.utp.pe.Diseno_Patrones.validacion;

import lombok.extern.slf4j.Slf4j;

import edu.utp.pe.Diseno_Patrones.exception.ValidacionException;
import edu.utp.pe.Diseno_Patrones.modelo.Persona;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class PersonaValidadorTest {
    @Test
    void debeValidarPersona() {
        log.info("Iniciando prueba: debeValidarPersona");
        PersonaValidador validador = new PersonaValidador();
        assertDoesNotThrow(() -> validador.validar(new Persona("Jose", "Chamorro", "correo@test.com", "999999999")));
        assertThrows(ValidacionException.class, () -> validador.validar(new Persona()));
    }
}

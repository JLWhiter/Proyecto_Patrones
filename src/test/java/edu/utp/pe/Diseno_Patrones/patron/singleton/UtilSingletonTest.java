package edu.utp.pe.Diseno_Patrones.patron.singleton;

import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class UtilSingletonTest {
    @Test
    void debeRetornarMismaInstancia() {
        log.info("Iniciando prueba: debeRetornarMismaInstancia");
        assertSame(UtilSingleton.getInstancia(), UtilSingleton.getInstancia());
        assertEquals("PED-1", UtilSingleton.getInstancia().generarCodigo("PED", 1L));
    }
}

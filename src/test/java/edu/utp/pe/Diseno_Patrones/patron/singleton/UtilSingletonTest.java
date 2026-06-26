package edu.utp.pe.Diseno_Patrones.patron.singleton;

import edu.utp.pe.Diseno_Patrones.service.patron.singleton.UtilSingleton;
import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class UtilSingletonTest {
    @Test
    void debeRetornarLaMismaInstancia() {
        UtilSingleton instancia1 = UtilSingleton.getInstancia();
        UtilSingleton instancia2 = UtilSingleton.getInstancia();

        assertSame(instancia1, instancia2);
    }
}

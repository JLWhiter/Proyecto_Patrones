package edu.utp.pe.Diseno_Patrones.patron.strategy;

import edu.utp.pe.Diseno_Patrones.service.patron.strategy.PagoEfectivo;
import edu.utp.pe.Diseno_Patrones.service.patron.strategy.PagoYape;
import edu.utp.pe.Diseno_Patrones.service.patron.strategy.ProcesadorPago;
import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class ProcesadorPagoTest {
    @Test
    void debeProcesarDiferentesMetodosDePago() {
        log.info("Iniciando prueba: debeProcesarDiferentesMetodosDePago");
        ProcesadorPago procesador = new ProcesadorPago(new PagoEfectivo());
        assertTrue(procesador.procesar(20).contains("efectivo"));
        procesador.cambiarMetodoPago(new PagoYape());
        assertTrue(procesador.procesar(20).contains("Yape"));
    }
}

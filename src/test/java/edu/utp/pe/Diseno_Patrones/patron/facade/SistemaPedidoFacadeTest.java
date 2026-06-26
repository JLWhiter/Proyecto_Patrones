package edu.utp.pe.Diseno_Patrones.patron.facade;

import edu.utp.pe.Diseno_Patrones.service.patron.facade.SistemaPedidoFacade;
import lombok.extern.slf4j.Slf4j;

import edu.utp.pe.Diseno_Patrones.service.patron.strategy.PagoYape;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class SistemaPedidoFacadeTest {
    @Test
    void debeProcesarPedidoCompleto() {
        log.info("Iniciando prueba: debeProcesarPedidoCompleto");
        SistemaPedidoFacade facade = new SistemaPedidoFacade();
        String resultado = facade.procesarPedido("boleta", new PagoYape(), 100.0);
        assertTrue(resultado.contains("Boleta"));
        assertTrue(resultado.contains("Yape"));
        assertTrue(resultado.contains("notificaciones"));
    }
}

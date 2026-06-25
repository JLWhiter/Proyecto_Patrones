package edu.utp.pe.Diseno_Patrones.validacion;

import lombok.extern.slf4j.Slf4j;

import edu.utp.pe.Diseno_Patrones.exception.ValidacionException;
import edu.utp.pe.Diseno_Patrones.modelo.Pedido;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class PedidoValidadorTest {
    @Test
    void debeValidarPedido() {
        log.info("Iniciando prueba: debeValidarPedido");
        PedidoValidador validador = new PedidoValidador();
        assertDoesNotThrow(() -> validador.validar(new Pedido("PED-001", "REGISTRADO", 100)));
        assertThrows(ValidacionException.class, () -> validador.validar(new Pedido("", "", -1)));
    }
}

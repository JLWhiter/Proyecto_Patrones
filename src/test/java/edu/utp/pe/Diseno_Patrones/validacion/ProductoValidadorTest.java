package edu.utp.pe.Diseno_Patrones.validacion;

import lombok.extern.slf4j.Slf4j;

import edu.utp.pe.Diseno_Patrones.exception.ValidacionException;
import edu.utp.pe.Diseno_Patrones.modelo.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class ProductoValidadorTest {
    @Test
    void debeValidarProducto() {
        log.info("Iniciando prueba: debeValidarProducto");
        ProductoValidador validador = new ProductoValidador();
        assertDoesNotThrow(() -> validador.validar(new Producto("Mouse", "Gamer", 80, 5)));
        assertThrows(ValidacionException.class, () -> validador.validar(new Producto("", "", -1, 0)));
    }
}

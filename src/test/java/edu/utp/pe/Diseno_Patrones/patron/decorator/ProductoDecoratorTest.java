package edu.utp.pe.Diseno_Patrones.patron.decorator;

import edu.utp.pe.Diseno_Patrones.service.patron.decorator.ProductoBase;
import edu.utp.pe.Diseno_Patrones.service.patron.decorator.ProductoConDescuento;
import edu.utp.pe.Diseno_Patrones.service.patron.decorator.ProductoConEnvioGratis;
import edu.utp.pe.Diseno_Patrones.service.patron.decorator.ProductoDecorator;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class ProductoDecoratorTest {

    @Test
    void productoBase_retornaPrecioOriginal() {
        log.info("Iniciando prueba: productoBase_retornaPrecioOriginal");
        ProductoDecorator producto = new ProductoBase("Laptop", 2500.0);
        assertEquals(2500.0, producto.getPrecioFinal());
        assertEquals("Laptop", producto.getNombre());
    }

    @Test
    void productoConDescuento_aplicaDescuento() {
        log.info("Iniciando prueba: productoConDescuento_aplicaDescuento");
        ProductoDecorator producto = new ProductoConDescuento(new ProductoBase("Laptop", 2500.0), 10);
        assertEquals(2250.0, producto.getPrecioFinal(), 0.01);
        assertTrue(producto.getDescripcion().contains("Descuento 10.0%"));
    }

    @Test
    void productoConEnvioGratis_mantienePrecio() {
        log.info("Iniciando prueba: productoConEnvioGratis_mantienePrecio");
        ProductoDecorator producto = new ProductoConEnvioGratis(new ProductoBase("Laptop", 2500.0));
        assertEquals(2500.0, producto.getPrecioFinal());
        assertTrue(producto.getDescripcion().contains("Envio gratis"));
    }

    @Test
    void decoradoresEncadenados_aplicanTodos() {
        log.info("Iniciando prueba: decoradoresEncadenados_aplicanTodos");
        ProductoDecorator producto = new ProductoBase("Laptop", 2500.0);
        producto = new ProductoConDescuento(producto, 10);
        producto = new ProductoConEnvioGratis(producto);
        assertEquals(2250.0, producto.getPrecioFinal(), 0.01);
        assertTrue(producto.getDescripcion().contains("Descuento"));
        assertTrue(producto.getDescripcion().contains("Envio gratis"));
    }
}

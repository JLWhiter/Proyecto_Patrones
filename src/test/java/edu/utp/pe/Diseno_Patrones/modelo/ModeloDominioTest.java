package edu.utp.pe.Diseno_Patrones.modelo;

import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class ModeloDominioTest {
    @Test
    void debeCrearProducto() {
        log.info("Iniciando prueba: debeCrearProducto");
        Producto producto = new Producto("Laptop", "Equipo para desarrollo", 2500.0, 10);
        assertEquals("Laptop", producto.getNombre());
        assertEquals(2500.0, producto.getPrecio());
        assertEquals(10, producto.getStock());
    }

    @Test
    void debeCrearLasDieciochoClasesDominio() {
        log.info("Iniciando prueba: debeCrearLasDieciochoClasesDominio");
        assertNotNull(new Almacen());
        assertNotNull(new Categoria());
        assertNotNull(new Cliente());
        assertNotNull(new Comprobante());
        assertNotNull(new DetallePedido());
        assertNotNull(new Devolucion());
        assertNotNull(new Direccion());
        assertNotNull(new Empleado());
        assertNotNull(new Envio());
        assertNotNull(new Inventario());
        assertNotNull(new Notificacion());
        assertNotNull(new Pago());
        assertNotNull(new Pedido());
        assertNotNull(new Persona());
        assertNotNull(new Producto());
        assertNotNull(new Proveedor());
        assertNotNull(new Rol());
        assertNotNull(new Usuario());
    }
}

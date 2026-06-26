package edu.utp.pe.Diseno_Patrones.patron.factory;

import edu.utp.pe.Diseno_Patrones.service.patron.factory.Boleta;
import edu.utp.pe.Diseno_Patrones.service.patron.factory.DocumentoFactory;
import edu.utp.pe.Diseno_Patrones.service.patron.factory.Factura;
import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class DocumentoFactoryTest {
    @Test
    void debeCrearBoletaYFactura() {
        log.info("Iniciando prueba: debeCrearBoletaYFactura");
        DocumentoFactory factory = new DocumentoFactory();
        assertInstanceOf(Boleta.class, factory.crearDocumento("boleta"));
        assertInstanceOf(Factura.class, factory.crearDocumento("factura"));
    }
}

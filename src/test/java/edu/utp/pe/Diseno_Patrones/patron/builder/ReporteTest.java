package edu.utp.pe.Diseno_Patrones.patron.builder;

import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class ReporteTest {
    @Test
    void debeConstruirReporte() {
        log.info("Iniciando prueba: debeConstruirReporte");
        Reporte reporte = new Reporte.Builder()
                .titulo("Reporte")
                .contenido("Contenido")
                .autor("UTP")
                .build();
        assertEquals("Reporte", reporte.getTitulo());
        assertEquals("UTP", reporte.getAutor());
    }
}

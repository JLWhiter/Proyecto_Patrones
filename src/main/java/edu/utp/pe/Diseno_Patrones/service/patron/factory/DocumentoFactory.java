package edu.utp.pe.Diseno_Patrones.service.patron.factory;

import edu.utp.pe.Diseno_Patrones.exception.ValidacionException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DocumentoFactory {
    public Documento crearDocumento(String tipo) {
        log.info("Creando documento de tipo: {}", tipo);
        if ("boleta".equalsIgnoreCase(tipo)) {
            return new Boleta();
        }
        if ("factura".equalsIgnoreCase(tipo)) {
            return new Factura();
        }
        throw new ValidacionException("Tipo de documento no valido");
    }
}

package edu.utp.pe.Diseno_Patrones.service.patron.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UtilSingleton {
    private static final UtilSingleton INSTANCIA = new UtilSingleton();

    private UtilSingleton() {
    }

    public static UtilSingleton getInstancia() {
        return INSTANCIA;
    }

    public String generarCodigo(String prefijo, Long id) {
        String codigo = prefijo + "-" + id;
        log.info("Codigo generado: {}", codigo);
        return codigo;
    }
}

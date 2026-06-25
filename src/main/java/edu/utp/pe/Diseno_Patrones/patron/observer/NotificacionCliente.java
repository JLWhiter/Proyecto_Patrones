package edu.utp.pe.Diseno_Patrones.patron.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NotificacionCliente implements ObservadorPedido {
    @Override
    public String actualizar(String mensaje) {
        log.info("Notificacion al cliente: {}", mensaje);
        return "Cliente notificado: " + mensaje;
    }
}

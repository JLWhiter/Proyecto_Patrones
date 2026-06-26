package edu.utp.pe.Diseno_Patrones.service.patron.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProcesadorPago {
    private MetodoPago metodoPago;

    public ProcesadorPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void cambiarMetodoPago(MetodoPago metodoPago) {
        log.info("Cambiando metodo de pago a: {}", metodoPago.getClass().getSimpleName());
        this.metodoPago = metodoPago;
    }

    public String procesar(double monto) {
        log.info("Procesando pago de S/ {} con {}", monto, metodoPago.getClass().getSimpleName());
        return metodoPago.pagar(monto);
    }
}

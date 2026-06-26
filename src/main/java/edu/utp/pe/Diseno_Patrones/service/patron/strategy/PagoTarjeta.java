package edu.utp.pe.Diseno_Patrones.service.patron.strategy;

public class PagoTarjeta implements MetodoPago {
    @Override
    public String pagar(double monto) {
        return "Pago con tarjeta realizado por S/ " + monto;
    }
}

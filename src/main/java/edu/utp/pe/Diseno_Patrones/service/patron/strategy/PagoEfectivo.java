package edu.utp.pe.Diseno_Patrones.service.patron.strategy;

public class PagoEfectivo implements MetodoPago {
    @Override
    public String pagar(double monto) {
        return "Pago en efectivo realizado por S/ " + monto;
    }
}

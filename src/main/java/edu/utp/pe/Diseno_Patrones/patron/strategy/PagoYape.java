package edu.utp.pe.Diseno_Patrones.patron.strategy;

public class PagoYape implements MetodoPago {
    @Override
    public String pagar(double monto) {
        return "Pago con Yape realizado por S/ " + monto;
    }
}

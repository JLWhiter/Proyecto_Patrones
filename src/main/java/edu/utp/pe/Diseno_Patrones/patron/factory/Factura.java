package edu.utp.pe.Diseno_Patrones.patron.factory;

public class Factura implements Documento {
    @Override
    public String generar() {
        return "Factura generada";
    }
}

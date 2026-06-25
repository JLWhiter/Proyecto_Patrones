package edu.utp.pe.Diseno_Patrones.patron.factory;

public class Boleta implements Documento {
    @Override
    public String generar() {
        return "Boleta generada";
    }
}

package edu.utp.pe.Diseno_Patrones.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Pago {
    private Long id;
    private String metodo;
    private double monto;
    private String estado;

    public Pago(String metodo, double monto, String estado) {
        this.metodo = metodo;
        this.monto = monto;
        this.estado = estado;
    }
}

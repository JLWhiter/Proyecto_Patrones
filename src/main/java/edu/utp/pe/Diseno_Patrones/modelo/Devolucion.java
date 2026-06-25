package edu.utp.pe.Diseno_Patrones.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Devolucion {
    private Long id;
    private String motivo;
    private String estado;
    private double montoDevuelto;

    public Devolucion(String motivo, String estado, double montoDevuelto) {
        this.motivo = motivo;
        this.estado = estado;
        this.montoDevuelto = montoDevuelto;
    }
}

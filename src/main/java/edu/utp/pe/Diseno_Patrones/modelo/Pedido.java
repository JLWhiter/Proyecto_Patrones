package edu.utp.pe.Diseno_Patrones.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Pedido {
    private Long id;
    private String codigo;
    private String estado;
    private double total;

    public Pedido(String codigo, String estado, double total) {
        this.codigo = codigo;
        this.estado = estado;
        this.total = total;
    }
}

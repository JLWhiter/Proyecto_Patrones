package edu.utp.pe.Diseno_Patrones.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DetallePedido {
    private Long id;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;

    public DetallePedido(int cantidad, double precioUnitario, double subtotal) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
    }
}

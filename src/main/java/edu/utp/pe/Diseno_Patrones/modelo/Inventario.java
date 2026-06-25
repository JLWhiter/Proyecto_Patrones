package edu.utp.pe.Diseno_Patrones.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Inventario {
    private Long id;
    private int stockActual;
    private int stockMinimo;

    public Inventario(int stockActual, int stockMinimo) {
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
    }
}

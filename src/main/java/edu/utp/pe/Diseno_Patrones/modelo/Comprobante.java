package edu.utp.pe.Diseno_Patrones.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Comprobante {
    private Long id;
    private String tipo;
    private String serie;
    private String numero;
    private double total;

    public Comprobante(String tipo, String serie, String numero, double total) {
        this.tipo = tipo;
        this.serie = serie;
        this.numero = numero;
        this.total = total;
    }
}

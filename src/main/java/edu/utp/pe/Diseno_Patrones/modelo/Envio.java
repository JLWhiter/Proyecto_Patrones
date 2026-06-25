package edu.utp.pe.Diseno_Patrones.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Envio {
    private Long id;
    private String empresa;
    private String numeroSeguimiento;
    private String estado;

    public Envio(String empresa, String numeroSeguimiento, String estado) {
        this.empresa = empresa;
        this.numeroSeguimiento = numeroSeguimiento;
        this.estado = estado;
    }
}

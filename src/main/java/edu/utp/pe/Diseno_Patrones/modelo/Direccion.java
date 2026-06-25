package edu.utp.pe.Diseno_Patrones.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Direccion {
    private Long id;
    private String departamento;
    private String provincia;
    private String distrito;
    private String detalle;

    public Direccion(String departamento, String provincia, String distrito, String detalle) {
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.detalle = detalle;
    }
}

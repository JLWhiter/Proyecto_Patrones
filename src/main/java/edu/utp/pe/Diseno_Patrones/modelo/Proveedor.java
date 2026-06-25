package edu.utp.pe.Diseno_Patrones.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Proveedor {
    private Long id;
    private String ruc;
    private String razonSocial;
    private String telefono;

    public Proveedor(String ruc, String razonSocial, String telefono) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
    }
}

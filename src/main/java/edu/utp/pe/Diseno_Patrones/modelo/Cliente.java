package edu.utp.pe.Diseno_Patrones.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Cliente {
    private Long id;
    private String codigoCliente;
    private String nombres;
    private String apellidos;
    private String correo;

    public Cliente(String codigoCliente, String nombres, String apellidos, String correo) {
        this.codigoCliente = codigoCliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
    }
}

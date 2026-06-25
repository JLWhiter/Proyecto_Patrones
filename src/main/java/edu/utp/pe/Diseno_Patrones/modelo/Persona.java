package edu.utp.pe.Diseno_Patrones.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Persona {
    private Long id;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;

    public Persona(String nombres, String apellidos, String correo, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
}

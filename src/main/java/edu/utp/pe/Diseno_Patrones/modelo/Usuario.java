package edu.utp.pe.Diseno_Patrones.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Usuario {
    private Long id;
    private String username;
    private String password;
    private String estado;

    public Usuario(String username, String password, String estado) {
        this.username = username;
        this.password = password;
        this.estado = estado;
    }
}

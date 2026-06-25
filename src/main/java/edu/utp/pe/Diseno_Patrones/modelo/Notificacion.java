package edu.utp.pe.Diseno_Patrones.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Notificacion {
    private Long id;
    private String destinatario;
    private String mensaje;
    private boolean leido;

    public Notificacion(String destinatario, String mensaje, boolean leido) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.leido = leido;
    }
}

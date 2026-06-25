package edu.utp.pe.Diseno_Patrones.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Empleado {
    private Long id;
    private String codigoEmpleado;
    private String nombres;
    private String cargo;

    public Empleado(String codigoEmpleado, String nombres, String cargo) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombres = nombres;
        this.cargo = cargo;
    }
}

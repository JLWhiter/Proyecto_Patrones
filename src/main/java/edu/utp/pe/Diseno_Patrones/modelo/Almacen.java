package edu.utp.pe.Diseno_Patrones.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Almacen {
    private Long id;
    private String nombre;
    private String ubicacion;

    public Almacen(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
}

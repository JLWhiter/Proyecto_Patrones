package edu.utp.pe.Diseno_Patrones.validacion;

import edu.utp.pe.Diseno_Patrones.exception.ValidacionException;
import edu.utp.pe.Diseno_Patrones.modelo.Producto;

public class ProductoValidador implements Validador<Producto> {
    @Override
    public void validar(Producto producto) {
        if (producto == null) {
            throw new ValidacionException("El producto no puede ser nulo");
        }
        if (producto.getNombre() == null || producto.getNombre().isBlank()) {
            throw new ValidacionException("El nombre del producto es obligatorio");
        }
        if (producto.getPrecio() < 0) {
            throw new ValidacionException("El precio no puede ser negativo");
        }
    }
}

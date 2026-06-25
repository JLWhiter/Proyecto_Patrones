package edu.utp.pe.Diseno_Patrones.patron.otro;

import edu.utp.pe.Diseno_Patrones.patron.decorator.ProductoBase;
import edu.utp.pe.Diseno_Patrones.patron.decorator.ProductoConDescuento;
import edu.utp.pe.Diseno_Patrones.patron.decorator.ProductoConEnvioGratis;
import edu.utp.pe.Diseno_Patrones.patron.decorator.ProductoDecorator;

/**
 * Patron Decorator: permite agregar responsabilidades adicionales a un objeto
 * de forma dinamica (descuento, envio gratis) sin modificar su clase base.
 */
public class Patron2 {
    public String descripcion() {
        return "Patron Decorator: agrega comportamiento adicional a objetos en tiempo de ejecucion";
    }

    public String ejemploDecorator() {
        ProductoDecorator producto = new ProductoBase("Laptop", 2500.0);
        producto = new ProductoConDescuento(producto, 10);
        producto = new ProductoConEnvioGratis(producto);
        return producto.getDescripcion() + " -> Precio final: S/ " + producto.getPrecioFinal();
    }
}

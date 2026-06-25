package edu.utp.pe.Diseno_Patrones.patron.decorator;

public class ProductoBase implements ProductoDecorator {
    private final String nombre;
    private final double precio;

    public ProductoBase(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecioFinal() {
        return precio;
    }

    @Override
    public String getDescripcion() {
        return nombre + " por S/ " + precio;
    }
}

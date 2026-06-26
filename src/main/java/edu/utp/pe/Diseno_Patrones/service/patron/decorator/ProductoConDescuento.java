package edu.utp.pe.Diseno_Patrones.service.patron.decorator;

public class ProductoConDescuento implements ProductoDecorator {
    private final ProductoDecorator producto;
    private final double porcentajeDescuento;

    public ProductoConDescuento(ProductoDecorator producto, double porcentajeDescuento) {
        this.producto = producto;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public String getNombre() {
        return producto.getNombre();
    }

    @Override
    public double getPrecioFinal() {
        return producto.getPrecioFinal() * (1 - porcentajeDescuento / 100);
    }

    @Override
    public String getDescripcion() {
        return producto.getDescripcion() + " [Descuento " + porcentajeDescuento + "%]";
    }
}

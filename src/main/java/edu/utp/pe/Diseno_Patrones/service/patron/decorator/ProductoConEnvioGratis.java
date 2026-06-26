package edu.utp.pe.Diseno_Patrones.service.patron.decorator;

public class ProductoConEnvioGratis implements ProductoDecorator {
    private final ProductoDecorator producto;

    public ProductoConEnvioGratis(ProductoDecorator producto) {
        this.producto = producto;
    }

    @Override
    public String getNombre() {
        return producto.getNombre();
    }

    @Override
    public double getPrecioFinal() {
        return producto.getPrecioFinal();
    }

    @Override
    public String getDescripcion() {
        return producto.getDescripcion() + " [Envio gratis incluido]";
    }
}

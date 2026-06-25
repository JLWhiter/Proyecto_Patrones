package edu.utp.pe.Diseno_Patrones.validacion;

import edu.utp.pe.Diseno_Patrones.exception.ValidacionException;
import edu.utp.pe.Diseno_Patrones.modelo.Pedido;

public class PedidoValidador implements Validador<Pedido> {
    @Override
    public void validar(Pedido pedido) {
        if (pedido == null) {
            throw new ValidacionException("El pedido no puede ser nulo");
        }
        if (pedido.getCodigo() == null || pedido.getCodigo().isBlank()) {
            throw new ValidacionException("El codigo del pedido es obligatorio");
        }
        if (pedido.getTotal() < 0) {
            throw new ValidacionException("El total no puede ser negativo");
        }
    }
}

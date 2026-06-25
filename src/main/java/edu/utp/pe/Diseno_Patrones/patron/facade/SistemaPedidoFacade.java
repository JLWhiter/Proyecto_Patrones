package edu.utp.pe.Diseno_Patrones.patron.facade;

import edu.utp.pe.Diseno_Patrones.patron.factory.DocumentoFactory;
import edu.utp.pe.Diseno_Patrones.patron.observer.NotificacionAlmacen;
import edu.utp.pe.Diseno_Patrones.patron.observer.NotificacionCliente;
import edu.utp.pe.Diseno_Patrones.patron.observer.PedidoSubject;
import edu.utp.pe.Diseno_Patrones.patron.strategy.MetodoPago;
import edu.utp.pe.Diseno_Patrones.patron.strategy.ProcesadorPago;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class SistemaPedidoFacade {
    private final DocumentoFactory documentoFactory = new DocumentoFactory();
    private final PedidoSubject pedidoSubject = new PedidoSubject();

    public SistemaPedidoFacade() {
        pedidoSubject.agregarObservador(new NotificacionCliente());
        pedidoSubject.agregarObservador(new NotificacionAlmacen());
    }

    public String procesarPedido(String tipoDocumento, MetodoPago metodoPago, double total) {
        log.info("Procesando pedido - documento: {}, total: S/ {}", tipoDocumento, total);
        String documento = documentoFactory.crearDocumento(tipoDocumento).generar();
        String pago = new ProcesadorPago(metodoPago).procesar(total);
        List<String> notificaciones = pedidoSubject.notificar("Pedido procesado");
        return documento + " | " + pago + " | " + notificaciones.size() + " notificaciones";
    }
}

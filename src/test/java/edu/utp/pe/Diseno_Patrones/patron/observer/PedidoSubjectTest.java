package edu.utp.pe.Diseno_Patrones.patron.observer;

import edu.utp.pe.Diseno_Patrones.service.patron.observer.NotificacionAlmacen;
import edu.utp.pe.Diseno_Patrones.service.patron.observer.NotificacionCliente;
import edu.utp.pe.Diseno_Patrones.service.patron.observer.PedidoSubject;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class PedidoSubjectTest {
    @Test
    void debeNotificarObservadores() {
        log.info("Iniciando prueba: debeNotificarObservadores");
        PedidoSubject subject = new PedidoSubject();
        subject.agregarObservador(new NotificacionCliente());
        subject.agregarObservador(new NotificacionAlmacen());
        assertEquals(2, subject.notificar("Pedido listo").size());
    }

    @Test
    void debeEliminarObservador() {
        log.info("Iniciando prueba: debeEliminarObservador");
        PedidoSubject subject = new PedidoSubject();
        NotificacionCliente cliente = new NotificacionCliente();
        subject.agregarObservador(cliente);
        subject.agregarObservador(new NotificacionAlmacen());
        subject.eliminarObservador(cliente);
        assertEquals(1, subject.notificar("Pedido listo").size());
    }
}

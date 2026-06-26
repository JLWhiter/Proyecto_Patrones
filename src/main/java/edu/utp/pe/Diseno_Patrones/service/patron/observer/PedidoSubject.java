package edu.utp.pe.Diseno_Patrones.service.patron.observer;

import java.util.ArrayList;
import java.util.List;

public class PedidoSubject {
    private final List<ObservadorPedido> observadores = new ArrayList<>();

    public void agregarObservador(ObservadorPedido observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(ObservadorPedido observador) {
        observadores.remove(observador);
    }

    public List<String> notificar(String mensaje) {
        return observadores.stream()
                .map(observador -> observador.actualizar(mensaje))
                .toList();
    }
}

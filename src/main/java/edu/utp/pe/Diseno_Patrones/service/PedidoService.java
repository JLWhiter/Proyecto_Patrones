package edu.utp.pe.Diseno_Patrones.service;

import edu.utp.pe.Diseno_Patrones.modelo.Pedido;
import java.util.List;

public interface PedidoService {
    Pedido guardar(Pedido pedido);
    List<Pedido> listar();
    Pedido buscarPorId(Long id);
    void eliminar(Long id);
}

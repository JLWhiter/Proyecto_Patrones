package edu.utp.pe.Diseno_Patrones.repository;

import edu.utp.pe.Diseno_Patrones.modelo.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoRepository {

    Pedido save(Pedido pedido);

    List<Pedido> findAll();

    Optional<Pedido> findById(Long id);

    void delete(Pedido pedido);
}

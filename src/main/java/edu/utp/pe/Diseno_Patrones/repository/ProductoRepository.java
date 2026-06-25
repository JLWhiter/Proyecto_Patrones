package edu.utp.pe.Diseno_Patrones.repository;

import edu.utp.pe.Diseno_Patrones.modelo.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository {

    Producto save(Producto producto);

    List<Producto> findAll();

    Optional<Producto> findById(Long id);

    void delete(Producto producto);
}

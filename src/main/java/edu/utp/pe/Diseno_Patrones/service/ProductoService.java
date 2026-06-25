package edu.utp.pe.Diseno_Patrones.service;

import edu.utp.pe.Diseno_Patrones.modelo.Producto;
import java.util.List;

public interface ProductoService {
    Producto guardar(Producto producto);
    List<Producto> listar();
    Producto buscarPorId(Long id);
    void eliminar(Long id);
}

package edu.utp.pe.Diseno_Patrones.service.impl;

import edu.utp.pe.Diseno_Patrones.exception.RecursoNoEncontradoException;
import edu.utp.pe.Diseno_Patrones.modelo.Producto;
import edu.utp.pe.Diseno_Patrones.repository.ProductoRepository;
import edu.utp.pe.Diseno_Patrones.service.ProductoService;
import edu.utp.pe.Diseno_Patrones.validacion.ProductoValidador;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ProductoServiceImpl implements ProductoService {
    private final ProductoRepository repository;
    private final ProductoValidador validador;

    public ProductoServiceImpl(ProductoRepository repository, ProductoValidador validador) {
        this.repository = repository;
        this.validador = validador;
    }

    @Override
    public Producto guardar(Producto producto) {
        log.info("Guardando producto: {}", producto.getNombre());
        validador.validar(producto);
        return repository.save(producto);
    }

    @Override
    public List<Producto> listar() {
        log.info("Listando productos");
        return repository.findAll();
    }

    @Override
    public Producto buscarPorId(Long id) {
        log.info("Buscando producto con id: {}", id);
        return repository.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException("Producto no encontrado"));
    }

    @Override
    public void eliminar(Long id) {
        log.info("Eliminando producto con id: {}", id);
        repository.delete(buscarPorId(id));
    }
}

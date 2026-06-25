package edu.utp.pe.Diseno_Patrones.service;

import edu.utp.pe.Diseno_Patrones.modelo.Producto;
import edu.utp.pe.Diseno_Patrones.repository.ProductoRepository;
import edu.utp.pe.Diseno_Patrones.service.impl.ProductoServiceImpl;
import edu.utp.pe.Diseno_Patrones.validacion.ProductoValidador;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class ProductoServiceImplTest {

    @Test
    void debeGuardarYListar() {
        log.info("Iniciando prueba: debeGuardarYListar");

        ProductoRepository repository = new ProductoRepositoryFake();
        ProductoService service = new ProductoServiceImpl(repository, new ProductoValidador());
        Producto producto = new Producto("Laptop", "Equipo", 2500.0, 3);

        assertSame(producto, service.guardar(producto));
        assertEquals(1, service.listar().size());
    }

    @Test
    void debeBuscarPorId() {
        log.info("Iniciando prueba: debeBuscarPorId");

        ProductoRepository repository = new ProductoRepositoryFake();
        ProductoService service = new ProductoServiceImpl(repository, new ProductoValidador());
        Producto producto = new Producto("Laptop", "Equipo", 2500.0, 3);
        service.guardar(producto);

        assertSame(producto, service.buscarPorId(1L));
    }

    static class ProductoRepositoryFake implements ProductoRepository {
        private final List<Producto> productos = new ArrayList<>();

        @Override
        public Producto save(Producto producto) {
            productos.add(producto);
            return producto;
        }

        @Override
        public List<Producto> findAll() {
            return productos;
        }

        @Override
        public Optional<Producto> findById(Long id) {
            if (productos.isEmpty()) {
                return Optional.empty();
            }
            return Optional.of(productos.get(0));
        }

        @Override
        public void delete(Producto producto) {
            productos.remove(producto);
        }
    }
}

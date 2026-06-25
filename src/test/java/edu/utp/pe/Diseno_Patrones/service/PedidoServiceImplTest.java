package edu.utp.pe.Diseno_Patrones.service;

import edu.utp.pe.Diseno_Patrones.modelo.Pedido;
import edu.utp.pe.Diseno_Patrones.repository.PedidoRepository;
import edu.utp.pe.Diseno_Patrones.service.impl.PedidoServiceImpl;
import edu.utp.pe.Diseno_Patrones.validacion.PedidoValidador;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class PedidoServiceImplTest {

    @Test
    void debeGuardarYListar() {
        log.info("Iniciando prueba: debeGuardarYListar");

        PedidoRepository repository = new PedidoRepositoryFake();
        PedidoService service = new PedidoServiceImpl(repository, new PedidoValidador());
        Pedido pedido = new Pedido("PED-001", "REGISTRADO", 300.0);

        assertSame(pedido, service.guardar(pedido));
        assertEquals(1, service.listar().size());
    }

    @Test
    void debeBuscarPorId() {
        log.info("Iniciando prueba: debeBuscarPorId");

        PedidoRepository repository = new PedidoRepositoryFake();
        PedidoService service = new PedidoServiceImpl(repository, new PedidoValidador());
        Pedido pedido = new Pedido("PED-001", "REGISTRADO", 300.0);
        service.guardar(pedido);

        assertSame(pedido, service.buscarPorId(1L));
    }

    static class PedidoRepositoryFake implements PedidoRepository {
        private final List<Pedido> pedidos = new ArrayList<>();

        @Override
        public Pedido save(Pedido pedido) {
            pedidos.add(pedido);
            return pedido;
        }

        @Override
        public List<Pedido> findAll() {
            return pedidos;
        }

        @Override
        public Optional<Pedido> findById(Long id) {
            if (pedidos.isEmpty()) {
                return Optional.empty();
            }
            return Optional.of(pedidos.get(0));
        }

        @Override
        public void delete(Pedido pedido) {
            pedidos.remove(pedido);
        }
    }
}

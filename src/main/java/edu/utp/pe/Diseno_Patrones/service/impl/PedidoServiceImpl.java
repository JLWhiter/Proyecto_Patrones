package edu.utp.pe.Diseno_Patrones.service.impl;

import edu.utp.pe.Diseno_Patrones.exception.RecursoNoEncontradoException;
import edu.utp.pe.Diseno_Patrones.modelo.Pedido;
import edu.utp.pe.Diseno_Patrones.repository.PedidoRepository;
import edu.utp.pe.Diseno_Patrones.service.PedidoService;
import edu.utp.pe.Diseno_Patrones.validacion.PedidoValidador;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class PedidoServiceImpl implements PedidoService {
    private final PedidoRepository repository;
    private final PedidoValidador validador;

    public PedidoServiceImpl(PedidoRepository repository, PedidoValidador validador) {
        this.repository = repository;
        this.validador = validador;
    }

    @Override
    public Pedido guardar(Pedido pedido) {
        log.info("Guardando pedido: {}", pedido.getCodigo());
        validador.validar(pedido);
        return repository.save(pedido);
    }

    @Override
    public List<Pedido> listar() {
        log.info("Listando pedidos");
        return repository.findAll();
    }

    @Override
    public Pedido buscarPorId(Long id) {
        log.info("Buscando pedido con id: {}", id);
        return repository.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException("Pedido no encontrado"));
    }

    @Override
    public void eliminar(Long id) {
        log.info("Eliminando pedido con id: {}", id);
        repository.delete(buscarPorId(id));
    }
}

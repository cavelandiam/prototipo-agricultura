package cavm.prototipo.agricultura.pedido.service.impl;

import cavm.prototipo.agricultura.pedido.model.dto.Pedido;
import cavm.prototipo.agricultura.pedido.service.IPedidoService;
import cavm.prototipo.agricultura.pedido.mapper.IPedidoMapper;
import cavm.prototipo.agricultura.pedido.repository.IPedidoRepository;
import cavm.prototipo.agricultura.pedido.model.entity.PedidoEntity;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PedidoService implements IPedidoService {

    private final IPedidoRepository repository;
    private final IPedidoMapper mapper;

    public PedidoService(IPedidoRepository repository, IPedidoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    @Transactional
    public Pedido create(Pedido pedido) {
        PedidoEntity entity = mapper.toEntity(pedido);
        PedidoEntity savedEntity = repository.save(entity);
        return mapper.toModel(savedEntity);
    }

    @Override
    @Transactional
    public Pedido update(Pedido pedido) {
        return repository.findById(pedido.getId())
                .map(x -> {
                    x.setFechaPedido(pedido.getFechaPedido());
                    x.setTotal(pedido.getTotal());
                    x.setEstado(pedido.getEstado());
                    return mapper.toModel(repository.save(x));
                }).orElse(null);
    }

    @Override
    @Transactional
    public List<Pedido> getAll() {
        return repository.findAll().stream()
                .map(mapper::toModel)
                .collect(Collectors.toList());
    }
}

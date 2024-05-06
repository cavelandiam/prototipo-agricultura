package cavm.prototipo.agricultura.pedido.service.impl;

import cavm.prototipo.agricultura.pedido.service.IPedidoService;
import cavm.prototipo.agricultura.pedido.mapper.IPedidoMapper;
import cavm.prototipo.agricultura.pedido.repository.IPedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoService implements IPedidoService {

    private final IPedidoRepository repository;
    private final IPedidoMapper mapper;

    public PedidoService(IPedidoRepository repository, IPedidoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}

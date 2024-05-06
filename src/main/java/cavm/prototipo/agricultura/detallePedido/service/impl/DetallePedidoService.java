package cavm.prototipo.agricultura.detallePedido.service.impl;

import cavm.prototipo.agricultura.detallePedido.mapper.IDetallePedidoMapper;
import cavm.prototipo.agricultura.detallePedido.repository.IDetallePedidoRepository;
import cavm.prototipo.agricultura.detallePedido.service.IDetallePedidoService;
import org.springframework.stereotype.Service;

@Service
public class DetallePedidoService implements IDetallePedidoService {

    private final IDetallePedidoRepository repository;
    private final IDetallePedidoMapper mapper;

    public DetallePedidoService(IDetallePedidoRepository repository, IDetallePedidoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}

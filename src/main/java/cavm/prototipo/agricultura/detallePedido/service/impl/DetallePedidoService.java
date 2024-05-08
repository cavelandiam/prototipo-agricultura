package cavm.prototipo.agricultura.detallePedido.service.impl;

import cavm.prototipo.agricultura.detallePedido.mapper.IDetallePedidoMapper;
import cavm.prototipo.agricultura.detallePedido.model.dto.DetallePedido;
import cavm.prototipo.agricultura.detallePedido.model.entity.DetallePedidoEntity;
import cavm.prototipo.agricultura.detallePedido.repository.IDetallePedidoRepository;
import cavm.prototipo.agricultura.detallePedido.service.IDetallePedidoService;
import cavm.prototipo.agricultura.user.model.entity.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DetallePedidoService implements IDetallePedidoService {

    private final IDetallePedidoRepository repository;
    private final IDetallePedidoMapper mapper;

    public DetallePedidoService(IDetallePedidoRepository repository, IDetallePedidoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    @Transactional
    public boolean create(List<DetallePedido> detallesPedido) {
        List<DetallePedidoEntity> detallePedidoEntities = detallesPedido.stream()
                .map(mapper::toEntity).toList();
        List<DetallePedidoEntity> savedEntities = repository.saveAll(detallePedidoEntities);
        return !savedEntities.isEmpty();
    }
}

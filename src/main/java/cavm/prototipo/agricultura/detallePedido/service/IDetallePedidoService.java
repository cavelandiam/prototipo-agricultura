package cavm.prototipo.agricultura.detallePedido.service;

import cavm.prototipo.agricultura.detallePedido.model.dto.DetallePedido;

import java.util.List;

public interface IDetallePedidoService {

    boolean create(List<DetallePedido> detallesPedido);
}

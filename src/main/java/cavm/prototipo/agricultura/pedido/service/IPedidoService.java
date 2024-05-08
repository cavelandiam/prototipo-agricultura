package cavm.prototipo.agricultura.pedido.service;

import cavm.prototipo.agricultura.pedido.model.dto.Pedido;

import java.util.List;

public interface IPedidoService {

    Pedido create(Pedido pedido);
    Pedido update(Pedido pedido);
    List<Pedido> getAll();
}

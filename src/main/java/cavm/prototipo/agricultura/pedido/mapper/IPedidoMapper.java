package cavm.prototipo.agricultura.pedido.mapper;

import cavm.prototipo.agricultura.pedido.model.dto.Pedido;
import cavm.prototipo.agricultura.pedido.model.entity.PedidoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IPedidoMapper {

    Pedido toModel(PedidoEntity PedidoEntity);
    PedidoEntity toEntity(Pedido Pedido);
}

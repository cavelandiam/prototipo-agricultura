package cavm.prototipo.agricultura.detallePedido.mapper;

import cavm.prototipo.agricultura.detallePedido.model.dto.DetallePedido;
import cavm.prototipo.agricultura.detallePedido.model.entity.DetallePedidoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IDetallePedidoMapper {

    DetallePedido toModel(DetallePedidoEntity DetallePedidoEntity);
    DetallePedidoEntity toEntity(DetallePedido DetallePedido);
}

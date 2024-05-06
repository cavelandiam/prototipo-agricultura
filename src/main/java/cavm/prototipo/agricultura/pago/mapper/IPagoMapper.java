package cavm.prototipo.agricultura.pago.mapper;

import cavm.prototipo.agricultura.pago.model.dto.Pago;
import cavm.prototipo.agricultura.pago.model.entity.PagoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IPagoMapper {

    Pago toModel(PagoEntity PagoEntity);
    PagoEntity toEntity(Pago Pago);
}

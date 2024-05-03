package cavm.prototipo.agricultura.producto.mapper;

import cavm.prototipo.agricultura.producto.model.dto.Producto;
import cavm.prototipo.agricultura.producto.model.entity.ProductoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IProductoMapper {

    //@Mapping(target = "nombre", source = "name")
    Producto toModel(ProductoEntity userEntity);
    ProductoEntity toEntity(Producto user);
}

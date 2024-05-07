package cavm.prototipo.agricultura.producto.mapper;

import cavm.prototipo.agricultura.producto.model.dto.Producto;
import cavm.prototipo.agricultura.producto.model.entity.ProductoEntity;
import org.mapstruct.Mapper;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface IProductoMapper {

    //@Mapping(target = "nombre", source = "name")
    Producto toModel(ProductoEntity userEntity);
    ProductoEntity toEntity(Producto user);

    default Optional<Producto> toModelOptional(Optional<ProductoEntity> productoEntity) {
        return productoEntity.map(this::toModel);
    }

    default Producto toEntityOptional(Optional<Producto> producto) {
        return producto.orElseThrow(() -> new IllegalArgumentException("El producto no puede ser nulo"));
    }
}

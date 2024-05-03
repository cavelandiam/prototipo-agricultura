package cavm.prototipo.agricultura.producto.service;

import cavm.prototipo.agricultura.producto.model.dto.Producto;

import java.util.List;

public interface IProductoService {

    Producto create(Producto product);
    List<Producto> getAll();
}

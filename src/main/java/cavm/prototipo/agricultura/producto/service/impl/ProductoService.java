package cavm.prototipo.agricultura.producto.service.impl;

import cavm.prototipo.agricultura.producto.mapper.IProductoMapper;
import cavm.prototipo.agricultura.producto.model.dto.Producto;
import cavm.prototipo.agricultura.producto.model.entity.ProductoEntity;
import cavm.prototipo.agricultura.producto.repository.IProductoRepository;
import cavm.prototipo.agricultura.producto.service.IProductoService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoService implements IProductoService {

    private final IProductoRepository repository;
    private final IProductoMapper mapper;

    public ProductoService(IProductoRepository repository, IProductoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    @Transactional
    public Producto create(Producto product) {
        ProductoEntity entity = mapper.toEntity(product);
        ProductoEntity savedEntity = repository.save(entity);
        return mapper.toModel(savedEntity);
    }

    @Override
    @Transactional
    public Producto update(Producto product) {
        return repository.findById(product.getId())
                .map(x -> {
                    x.setNombre(product.getNombre());
                    x.setDescripcion(product.getDescripcion());
                    x.setPrecio(product.getPrecio());
                    x.setCantidadDisponible(product.getCantidadDisponible());
                    x.setRegisterDate(new Date());
                    x.setState(product.getState());
                    return mapper.toModel(repository.save(x));
                }).orElse(null);
    }

    @Override
    @Transactional
    public List<Producto> getAll() {
        return repository.findAll().stream()
                .map(mapper::toModel)
                .collect(Collectors.toList());
    }
}

package cavm.prototipo.agricultura.producto.controller;

import cavm.prototipo.agricultura.producto.model.dto.Producto;
import cavm.prototipo.agricultura.producto.model.request.ProductoRequest;
import cavm.prototipo.agricultura.producto.service.IProductoService;
import cavm.prototipo.agricultura.user.model.dto.User;
import cavm.prototipo.agricultura.user.model.request.UserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/producto")
public class ProductoController {
    private final IProductoService iProductoService;

    public ProductoController(IProductoService iProductoService) {
        this.iProductoService = iProductoService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Producto> create(@RequestBody ProductoRequest request) {
        Producto product = Producto.builder()
                .nombre(request.getNombre())
                .descripcion(request.getDescripcion())
                .precio(request.getPrecio())
                .cantidadDisponible(request.getCantidadDisponible())
                .agricultor(request.getAgricultor())
                .registerDate(new Date())
                .state(true)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(iProductoService.create(product));
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> update(@RequestBody ProductoRequest request) {
        Producto product = Producto.builder()
                .id(request.getId())
                .nombre(request.getNombre())
                .descripcion(request.getDescripcion())
                .precio(request.getPrecio())
                .cantidadDisponible(request.getCantidadDisponible())
                .agricultor(request.getAgricultor())
                .registerDate(new Date())
                .state(request.getState())
                .build();
        Producto updated = iProductoService.update(product);
        return updated == null ? ResponseEntity.status(HttpStatus.NOT_FOUND).build() : ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Producto>> getAll() {
        return new ResponseEntity<>(iProductoService.getAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/agricultor/{agricultor}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Producto>> getByFarmer(@PathVariable String agricultor) {
        List<Producto> productos = iProductoService.getAll();
        return ResponseEntity.ok(productos.stream()
                .filter(p -> p.getAgricultor() != null && agricultor.equals(p.getAgricultor().getDocumentNumber()))
                .collect(Collectors.toList()));
    }
}

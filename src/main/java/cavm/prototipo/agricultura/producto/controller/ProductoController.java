package cavm.prototipo.agricultura.producto.controller;

import cavm.prototipo.agricultura.producto.model.dto.Producto;
import cavm.prototipo.agricultura.producto.model.request.ProductoRequest;
import cavm.prototipo.agricultura.producto.service.IProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/producto")
public class ProductoController {
    private final IProductoService iProductoService;

    public ProductoController(IProductoService iProductoService) {
        this.iProductoService = iProductoService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
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

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Producto>> getAll() {
        return new ResponseEntity<>(iProductoService.getAll(), HttpStatus.OK);
    }
}
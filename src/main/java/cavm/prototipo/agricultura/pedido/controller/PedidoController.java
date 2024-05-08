package cavm.prototipo.agricultura.pedido.controller;

import cavm.prototipo.agricultura.pedido.model.dto.Pedido;
import cavm.prototipo.agricultura.pedido.model.request.PedidoRequest;
import cavm.prototipo.agricultura.pedido.service.IPedidoService;
import cavm.prototipo.agricultura.producto.model.dto.Producto;
import cavm.prototipo.agricultura.producto.model.request.ProductoRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

    private final IPedidoService iPedidoService;

    public PedidoController(IPedidoService iPedidoService) {
        this.iPedidoService = iPedidoService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Pedido> create(@RequestBody PedidoRequest request) {
        Pedido pedido = Pedido.builder()
                .fechaPedido(new Date())
                .cliente(request.getCliente())
                .total(0D)
                .estado("CREATED")
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(iPedidoService.create(pedido));
    }
}

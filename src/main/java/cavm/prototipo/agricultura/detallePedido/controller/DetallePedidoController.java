package cavm.prototipo.agricultura.detallePedido.controller;

import cavm.prototipo.agricultura.detallePedido.model.dto.DetallePedido;
import cavm.prototipo.agricultura.detallePedido.model.request.DetallePedidoRequest;
import cavm.prototipo.agricultura.detallePedido.service.IDetallePedidoService;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/detalle/pedido")
public class DetallePedidoController {

    private final IDetallePedidoService iDetallePedidoService;

    public DetallePedidoController(IDetallePedidoService iDetallePedidoService) {
        this.iDetallePedidoService = iDetallePedidoService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> create(@RequestBody List<DetallePedidoRequest> request) {
        List<DetallePedido> detallesPedido = request.stream()
                .map(detalle -> DetallePedido.builder()
                        .pedido(detalle.getPedido())
                        .producto(detalle.getProducto())
                        .cantidad(detalle.getCantidad())
                        .precio(detalle.getPrecio())
                        .build())
                .collect(Collectors.toList());
        boolean created = iDetallePedidoService.create(detallesPedido);
        return created ? ResponseEntity.status(HttpStatus.CREATED).build() : ResponseEntity.status(HttpStatus.CONFLICT).build();
    }
}

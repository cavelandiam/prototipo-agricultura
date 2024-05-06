package cavm.prototipo.agricultura.detallePedido.controller;

import cavm.prototipo.agricultura.detallePedido.service.IDetallePedidoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/detalle/pedido")
public class DetallePedidoController {

    private final IDetallePedidoService iDetallePedidoService;

    public DetallePedidoController(IDetallePedidoService iDetallePedidoService) {
        this.iDetallePedidoService = iDetallePedidoService;
    }
}

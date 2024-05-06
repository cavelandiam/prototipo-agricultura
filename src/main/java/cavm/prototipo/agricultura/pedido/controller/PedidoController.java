package cavm.prototipo.agricultura.pedido.controller;

import cavm.prototipo.agricultura.pedido.service.IPedidoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

    private final IPedidoService iPedidoService;

    public PedidoController(IPedidoService iPedidoService) {
        this.iPedidoService = iPedidoService;
    }
}

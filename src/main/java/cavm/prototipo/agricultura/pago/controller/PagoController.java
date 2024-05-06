package cavm.prototipo.agricultura.pago.controller;

import cavm.prototipo.agricultura.pago.service.IPagoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pago")
public class PagoController {

    private final IPagoService iPagoService;

    public PagoController(IPagoService iPagoService) {
        this.iPagoService = iPagoService;
    }
}

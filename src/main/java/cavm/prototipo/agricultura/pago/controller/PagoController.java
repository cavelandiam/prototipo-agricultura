package cavm.prototipo.agricultura.pago.controller;

import cavm.prototipo.agricultura.pago.model.dto.Pago;
import cavm.prototipo.agricultura.pago.model.request.PagoRequest;
import cavm.prototipo.agricultura.pago.service.IPagoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/pago")
public class PagoController {

    private final IPagoService iPagoService;

    public PagoController(IPagoService iPagoService) {
        this.iPagoService = iPagoService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Pago> create(@RequestBody PagoRequest request) {
        Pago pago = Pago.builder()
                .pedido(request.getPedido())
                .monto(request.getMonto())
                .metodoPago(request.getMetodoPago())
                .fechaPago(new Date())
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(iPagoService.create(pago));
    }
}

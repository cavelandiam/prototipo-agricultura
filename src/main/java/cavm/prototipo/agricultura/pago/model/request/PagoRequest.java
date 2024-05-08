package cavm.prototipo.agricultura.pago.model.request;

import cavm.prototipo.agricultura.pedido.model.dto.Pedido;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PagoRequest {
    private Long id;
    private Pedido pedido;
    private Double monto;
    private String metodoPago;
    private Date fechaPago;
}

package cavm.prototipo.agricultura.pago.model.dto;

import cavm.prototipo.agricultura.pedido.model.entity.PedidoEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pago {

    private Long pagoId;
    private PedidoEntity pedido;
    private Date fechaPago;
    private Double monto;
    private String metodoPago;
}

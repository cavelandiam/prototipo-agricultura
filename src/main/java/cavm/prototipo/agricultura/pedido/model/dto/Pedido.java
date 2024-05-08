package cavm.prototipo.agricultura.pedido.model.dto;

import cavm.prototipo.agricultura.detallePedido.model.dto.DetallePedido;
import cavm.prototipo.agricultura.user.model.dto.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    private Long id;
    private User cliente;
    private Date fechaPedido;
    private String estado;
    private List<DetallePedido> detallesPedido;
    private Double total;
}

package cavm.prototipo.agricultura.pedido.model.dto;

import cavm.prototipo.agricultura.detallePedido.model.entity.DetallePedidoEntity;
import cavm.prototipo.agricultura.user.model.entity.UserEntity;
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

    private Long pedidoId;
    private UserEntity consumidor;
    private Date fechaPedido;
    private String estado;
    private List<DetallePedidoEntity> detallesPedido;
    private Double total;
}

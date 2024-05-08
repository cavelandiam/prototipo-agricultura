package cavm.prototipo.agricultura.pedido.model.request;

import cavm.prototipo.agricultura.detallePedido.model.dto.DetallePedido;
import cavm.prototipo.agricultura.user.model.dto.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class PedidoRequest {

    private Long id;
    private User cliente;
    private Date fechaPedido;
    private String estado;
    private List<DetallePedido> detallesPedido;
    private Double total;
}

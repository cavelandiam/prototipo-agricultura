package cavm.prototipo.agricultura.detallePedido.model.request;

import cavm.prototipo.agricultura.pedido.model.dto.Pedido;
import cavm.prototipo.agricultura.producto.model.dto.Producto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetallePedidoRequest {

    private Long id;
    private Pedido pedido;
    private Producto producto;
    private Integer cantidad;
    private Double precio;
}

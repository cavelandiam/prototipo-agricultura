package cavm.prototipo.agricultura.detallePedido.model.dto;

import cavm.prototipo.agricultura.pedido.model.dto.Pedido;
import cavm.prototipo.agricultura.pedido.model.entity.PedidoEntity;
import cavm.prototipo.agricultura.producto.model.dto.Producto;
import cavm.prototipo.agricultura.producto.model.entity.ProductoEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DetallePedido {


    private Pedido pedido;
    private Producto producto;
    private Integer cantidad;
    private Double precio;
}

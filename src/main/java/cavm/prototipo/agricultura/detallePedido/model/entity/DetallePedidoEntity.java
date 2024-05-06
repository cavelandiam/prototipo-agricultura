package cavm.prototipo.agricultura.detallePedido.model.entity;

import cavm.prototipo.agricultura.pedido.model.entity.PedidoEntity;
import cavm.prototipo.agricultura.producto.model.entity.ProductoEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "detalles_pedido")
@Data
public class DetallePedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private PedidoEntity pedido;

    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private ProductoEntity producto;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false)
    private Double precio;
}

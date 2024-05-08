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
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_pedido", nullable = false)
    private PedidoEntity pedido;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private ProductoEntity producto;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false)
    private Double precio;
}

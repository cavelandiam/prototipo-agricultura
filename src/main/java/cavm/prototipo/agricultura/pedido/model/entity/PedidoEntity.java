package cavm.prototipo.agricultura.pedido.model.entity;

import cavm.prototipo.agricultura.detallePedido.model.entity.DetallePedidoEntity;
import cavm.prototipo.agricultura.user.model.entity.UserEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pedido")
@Data
public class PedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pedidoId;

    @ManyToOne
    @JoinColumn(name = "consumidor_id", nullable = false)
    private UserEntity consumidor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date fechaPedido;

    @Column(nullable = false)
    private String estado;

    @OneToMany(mappedBy = "pedido")
    private List<DetallePedidoEntity> detallesPedido;

    @Column(nullable = false)
    private Double total;
}

package cavm.prototipo.agricultura.pago.model.entity;

import cavm.prototipo.agricultura.pedido.model.entity.PedidoEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "pago")
@Data
public class PagoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_pedido", nullable = false)
    private PedidoEntity pedido;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date fechaPago;

    @Column(nullable = false)
    private Double monto;

    @Column(nullable = false)
    private String metodoPago;

}

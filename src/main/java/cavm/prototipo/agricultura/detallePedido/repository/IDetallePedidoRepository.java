package cavm.prototipo.agricultura.detallePedido.repository;

import cavm.prototipo.agricultura.detallePedido.model.entity.DetallePedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetallePedidoRepository extends JpaRepository<DetallePedidoEntity, Long> {
}

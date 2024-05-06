package cavm.prototipo.agricultura.pedido.repository;

import cavm.prototipo.agricultura.pedido.model.entity.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPedidoRepository extends JpaRepository<PedidoEntity, Long> {
}

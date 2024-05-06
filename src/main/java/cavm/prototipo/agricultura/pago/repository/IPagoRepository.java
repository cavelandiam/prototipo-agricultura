package cavm.prototipo.agricultura.pago.repository;

import cavm.prototipo.agricultura.pago.model.entity.PagoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPagoRepository extends JpaRepository<PagoEntity, Long> {
}

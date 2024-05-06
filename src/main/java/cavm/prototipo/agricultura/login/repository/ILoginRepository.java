package cavm.prototipo.agricultura.login.repository;

import cavm.prototipo.agricultura.login.model.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoginRepository extends JpaRepository<LoginEntity, Long> {
}

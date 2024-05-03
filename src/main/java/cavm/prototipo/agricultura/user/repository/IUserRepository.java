package cavm.prototipo.agricultura.user.repository;

import cavm.prototipo.agricultura.user.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserEntity, Long>{
    @Query(value = "SELECT * FROM usuario WHERE document_number = :documentNumber", nativeQuery = true)
    UserEntity findByDocumentNumber(@Param("documentNumber") String documentNumber);
}

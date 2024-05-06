package cavm.prototipo.agricultura.login.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "login")
@Data
public class LoginEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private boolean status;
}

package cavm.prototipo.agricultura.user.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "usuario")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "document_number")
    private String documentNumber;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "username")
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "birth")
    private Date birth;
    @Column(name = "is_farmer")
    private boolean isFarmer;
    @Column(name = "register_date")
    private Date registerDate;
    @Column(name = "state")
    private boolean state;
}

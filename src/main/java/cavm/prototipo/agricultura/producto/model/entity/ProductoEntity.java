package cavm.prototipo.agricultura.producto.model.entity;

import cavm.prototipo.agricultura.user.model.entity.UserEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "producto")
@Data
public class ProductoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio")
    private Double precio;
    @Column(name = "cantidadDisponible")
    private Integer cantidadDisponible;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_agricultor", nullable = false)
    private UserEntity agricultor;
    @Column(name = "register_date")
    private Date registerDate;
    @Column(name = "state")
    private boolean state;
}

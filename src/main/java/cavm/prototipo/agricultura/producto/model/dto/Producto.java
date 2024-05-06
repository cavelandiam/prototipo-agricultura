package cavm.prototipo.agricultura.producto.model.dto;

import cavm.prototipo.agricultura.user.model.dto.User;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    private Long id;
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer cantidadDisponible;
    private User agricultor;
    private Date registerDate;
    private Boolean state;
}

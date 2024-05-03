package cavm.prototipo.agricultura.producto.model.request;

import cavm.prototipo.agricultura.user.model.dto.User;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ProductoRequest {

    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer cantidadDisponible;
    private User agricultor;
    private String agricultorDocumentNumber;
}

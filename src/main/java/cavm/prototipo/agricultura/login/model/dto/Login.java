package cavm.prototipo.agricultura.login.model.dto;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Login {

    private Long id;
    private String username;
    private String email;
    private String password;
    private boolean status;
}

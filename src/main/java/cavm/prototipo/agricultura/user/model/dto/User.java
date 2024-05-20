package cavm.prototipo.agricultura.user.model.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String documentNumber;
    private String name;
    private String lastname;
    private String username;
    private String email;
    private String phone;
    private Date birth;
    private Boolean isFarmer;
    private Date registerDate;
    private boolean state;
}

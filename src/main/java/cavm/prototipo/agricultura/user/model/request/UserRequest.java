package cavm.prototipo.agricultura.user.model.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserRequest {
    private String documentNumber;
    private String name;
    private String lastname;
    private String username;
    private String email;
    private Boolean isFarmer;
    private String phone;
    private Date birth;
}

package cavm.prototipo.agricultura.login.mapper;

import cavm.prototipo.agricultura.login.model.dto.Login;
import cavm.prototipo.agricultura.login.model.entity.LoginEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ILoginMapper {

    Login toModel(LoginEntity LoginEntity);
    LoginEntity toEntity(Login Login);
}

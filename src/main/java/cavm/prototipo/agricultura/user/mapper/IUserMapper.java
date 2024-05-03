package cavm.prototipo.agricultura.user.mapper;

import cavm.prototipo.agricultura.user.model.dto.User;
import cavm.prototipo.agricultura.user.model.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IUserMapper {

    //@Mapping(target = "nombre", source = "name")
    User toModel(UserEntity userEntity);
    UserEntity toEntity(User user);
}

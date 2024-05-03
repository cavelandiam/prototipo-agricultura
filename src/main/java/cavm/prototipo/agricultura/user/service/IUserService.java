package cavm.prototipo.agricultura.user.service;

import cavm.prototipo.agricultura.user.model.dto.User;

import java.util.List;

public interface IUserService {

    User create(User user);
    List<User> getAll();
    User getByDocumentNumber(String documentNumber);
}

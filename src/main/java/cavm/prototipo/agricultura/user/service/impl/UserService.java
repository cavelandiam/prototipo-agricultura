package cavm.prototipo.agricultura.user.service.impl;

import cavm.prototipo.agricultura.user.mapper.IUserMapper;
import cavm.prototipo.agricultura.user.model.dto.User;
import cavm.prototipo.agricultura.user.model.entity.UserEntity;
import cavm.prototipo.agricultura.user.repository.IUserRepository;
import cavm.prototipo.agricultura.user.service.IUserService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {

    private final IUserRepository repository;
    private final IUserMapper mapper;


    public UserService(IUserRepository repository, IUserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    @Transactional
    public User create(User user) {
        UserEntity userEntity = mapper.toEntity(user);
        UserEntity savedEntity = repository.save(userEntity);
        return mapper.toModel(savedEntity);
    }

    @Override
    @Transactional
    public List<User> getAll() {
        return repository.findAll().stream()
                .map(mapper::toModel)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public User getByDocumentNumber(String documentNumber) {
        User user = null;
        try{
            UserEntity entity = repository.findByDocumentNumber(documentNumber);
            user = mapper.toModel(entity);
        }catch (Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
        return user;
    }
}

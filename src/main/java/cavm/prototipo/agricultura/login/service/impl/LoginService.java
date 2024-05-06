package cavm.prototipo.agricultura.login.service.impl;

import cavm.prototipo.agricultura.login.mapper.ILoginMapper;
import cavm.prototipo.agricultura.login.repository.ILoginRepository;
import cavm.prototipo.agricultura.login.service.ILoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService {

    private final ILoginRepository repository;
    private final ILoginMapper mapper;

    public LoginService(ILoginRepository repository, ILoginMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}

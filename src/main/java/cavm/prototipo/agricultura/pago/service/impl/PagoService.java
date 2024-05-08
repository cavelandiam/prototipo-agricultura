package cavm.prototipo.agricultura.pago.service.impl;

import cavm.prototipo.agricultura.pago.mapper.IPagoMapper;
import cavm.prototipo.agricultura.pago.model.dto.Pago;
import cavm.prototipo.agricultura.pago.model.entity.PagoEntity;
import cavm.prototipo.agricultura.pago.repository.IPagoRepository;
import cavm.prototipo.agricultura.pago.service.IPagoService;
import cavm.prototipo.agricultura.user.model.entity.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class PagoService implements IPagoService {

    private final IPagoRepository repository;
    private final IPagoMapper mapper;

    public PagoService(IPagoRepository repository, IPagoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    @Transactional
    public Pago create(Pago pago) {
        PagoEntity pagoEntity = mapper.toEntity(pago);
        PagoEntity savedEntity = repository.save(pagoEntity);
        return mapper.toModel(savedEntity);
    }
}

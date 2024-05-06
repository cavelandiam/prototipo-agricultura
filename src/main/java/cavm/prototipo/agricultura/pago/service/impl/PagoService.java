package cavm.prototipo.agricultura.pago.service.impl;

import cavm.prototipo.agricultura.pago.mapper.IPagoMapper;
import cavm.prototipo.agricultura.pago.repository.IPagoRepository;
import cavm.prototipo.agricultura.pago.service.IPagoService;
import org.springframework.stereotype.Service;

@Service
public class PagoService implements IPagoService {

    private final IPagoRepository repository;
    private final IPagoMapper mapper;

    public PagoService(IPagoRepository repository, IPagoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}

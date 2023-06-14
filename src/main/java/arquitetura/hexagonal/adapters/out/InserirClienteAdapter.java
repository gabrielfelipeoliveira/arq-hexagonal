package arquitetura.hexagonal.adapters.out;

import arquitetura.hexagonal.adapters.out.repository.ClienteRepository;
import arquitetura.hexagonal.adapters.out.repository.mapper.ClienteEntityMapper;
import arquitetura.hexagonal.application.core.domain.Cliente;
import arquitetura.hexagonal.application.ports.out.InserirClienteOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InserirClienteAdapter implements InserirClienteOutPutPort {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteEntityMapper clienteEntityMapper;

    @Override
    public void inserir(Cliente cliente) {
        clienteRepository.save(clienteEntityMapper.toClienteEntity(cliente));
    }
}

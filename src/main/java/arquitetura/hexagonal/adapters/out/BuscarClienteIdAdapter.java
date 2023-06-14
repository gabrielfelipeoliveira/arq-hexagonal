package arquitetura.hexagonal.adapters.out;

import arquitetura.hexagonal.adapters.out.repository.ClienteRepository;
import arquitetura.hexagonal.adapters.out.repository.entity.ClienteEntity;
import arquitetura.hexagonal.adapters.out.repository.mapper.ClienteEntityMapper;
import arquitetura.hexagonal.application.core.domain.Cliente;
import arquitetura.hexagonal.application.ports.out.BuscarClienteIdOutPutPort;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BuscarClienteIdAdapter implements BuscarClienteIdOutPutPort {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteEntityMapper clienteEntityMapper;

    public Optional<Cliente> buscar(String id){
        Optional<ClienteEntity> clientes = clienteRepository.findById(id);
        return clientes.map(entity -> clienteEntityMapper.toCliente(entity));
    }

}

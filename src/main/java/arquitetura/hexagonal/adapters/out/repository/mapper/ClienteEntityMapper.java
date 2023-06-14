package arquitetura.hexagonal.adapters.out.repository.mapper;

import arquitetura.hexagonal.adapters.out.repository.entity.ClienteEntity;
import arquitetura.hexagonal.application.core.domain.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteEntityMapper {

    ClienteEntity toClienteEntity(Cliente cliente);

    Cliente toCliente(ClienteEntity cliente);
}

package arquitetura.hexagonal.adapters.in.consumer.mapper;


import arquitetura.hexagonal.adapters.in.consumer.message.ClienteMensagem;
import arquitetura.hexagonal.application.core.domain.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClienteMensagemMapper {

    @Mapping(target = "endereco", ignore = true)
    Cliente toCliente(ClienteMensagem clienteMensagem);
}

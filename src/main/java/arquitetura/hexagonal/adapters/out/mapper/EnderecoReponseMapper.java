package arquitetura.hexagonal.adapters.out.mapper;


import arquitetura.hexagonal.adapters.out.client.response.EnderecoResponse;
import arquitetura.hexagonal.application.core.domain.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnderecoReponseMapper {

    Endereco toEndereco(EnderecoResponse enderecoResponse);

}


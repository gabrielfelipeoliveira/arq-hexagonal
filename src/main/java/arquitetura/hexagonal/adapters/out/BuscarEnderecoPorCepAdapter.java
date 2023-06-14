package arquitetura.hexagonal.adapters.out;

import arquitetura.hexagonal.adapters.out.client.BuscarPorEnderecoClient;
import arquitetura.hexagonal.adapters.out.client.response.EnderecoResponse;
import arquitetura.hexagonal.adapters.out.mapper.EnderecoReponseMapper;
import arquitetura.hexagonal.application.core.domain.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarEnderecoPorCepAdapter implements arquitetura.hexagonal.application.ports.out.BuscarEnderecoPorCep {

    @Autowired
    private BuscarPorEnderecoClient buscarPorEnderecoClient;

    @Autowired
    private EnderecoReponseMapper enderecoReponseMapper;

    @Override
    public Endereco buscar(String cep) {
        EnderecoResponse endereco = buscarPorEnderecoClient.buscar(cep);
        return enderecoReponseMapper.toEndereco(endereco);
    }
}

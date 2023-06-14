package arquitetura.hexagonal.application.ports.out;

import arquitetura.hexagonal.application.core.domain.Endereco;

public interface BuscarEnderecoPorCep {

    Endereco buscar(String cep);
}

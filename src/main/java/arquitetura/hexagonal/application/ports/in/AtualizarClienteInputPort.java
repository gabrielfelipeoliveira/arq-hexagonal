package arquitetura.hexagonal.application.ports.in;

import arquitetura.hexagonal.application.core.domain.Cliente;

public interface AtualizarClienteInputPort {

    void atualizar(Cliente cliente, String cep);
}

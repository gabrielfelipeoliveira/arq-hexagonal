package arquitetura.hexagonal.application.ports.out;

import arquitetura.hexagonal.application.core.domain.Cliente;

public interface AtualizarClienteOutputPort {

    void atualizar(Cliente cliente);
}

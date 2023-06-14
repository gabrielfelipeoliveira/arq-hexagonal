package arquitetura.hexagonal.application.ports.out;

import arquitetura.hexagonal.application.core.domain.Cliente;

public interface InserirClienteOutPutPort {

    void inserir(Cliente cliente);
}

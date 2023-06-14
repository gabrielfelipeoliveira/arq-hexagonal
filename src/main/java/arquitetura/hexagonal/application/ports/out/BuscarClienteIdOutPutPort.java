package arquitetura.hexagonal.application.ports.out;

import arquitetura.hexagonal.application.core.domain.Cliente;

import java.util.Optional;

public interface BuscarClienteIdOutPutPort {

    Optional<Cliente> buscar(String id);
}

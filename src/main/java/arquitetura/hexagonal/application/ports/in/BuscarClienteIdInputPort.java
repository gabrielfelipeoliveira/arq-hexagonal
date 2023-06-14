package arquitetura.hexagonal.application.ports.in;

import arquitetura.hexagonal.application.core.domain.Cliente;

public interface BuscarClienteIdInputPort {

    Cliente buscar(String id);
}

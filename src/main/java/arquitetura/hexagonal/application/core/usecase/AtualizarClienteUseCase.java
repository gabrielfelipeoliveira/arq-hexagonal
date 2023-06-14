package arquitetura.hexagonal.application.core.usecase;

import arquitetura.hexagonal.application.core.domain.Cliente;
import arquitetura.hexagonal.application.core.domain.Endereco;
import arquitetura.hexagonal.application.ports.in.AtualizarClienteInputPort;
import arquitetura.hexagonal.application.ports.in.BuscarClienteIdInputPort;
import arquitetura.hexagonal.application.ports.out.AtualizarClienteOutputPort;
import arquitetura.hexagonal.application.ports.out.BuscarEnderecoPorCep;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
public class AtualizarClienteUseCase implements AtualizarClienteInputPort {

    private BuscarClienteIdInputPort buscarClienteIdInputPort;

    private BuscarEnderecoPorCep buscarEnderecoPorCep;

    private AtualizarClienteOutputPort atualizarClienteOutputPort;

    @Autowired
    public void atualizar(Cliente cliente, String cep){
        buscarClienteIdInputPort.buscar(cliente.getId());
        cliente.setEndereco(buscarEnderecoPorCep.buscar(cep));
        atualizarClienteOutputPort.atualizar(cliente);
    }
}

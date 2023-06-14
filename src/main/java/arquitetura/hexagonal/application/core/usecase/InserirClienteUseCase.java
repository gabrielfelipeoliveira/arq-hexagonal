package arquitetura.hexagonal.application.core.usecase;

import arquitetura.hexagonal.application.core.domain.Cliente;
import arquitetura.hexagonal.application.core.domain.Endereco;
import arquitetura.hexagonal.application.ports.in.InserirClienteInputPort;
import arquitetura.hexagonal.application.ports.out.BuscarEnderecoPorCep;
import arquitetura.hexagonal.application.ports.out.EnviarCpfValidacaoOutputPort;
import arquitetura.hexagonal.application.ports.out.InserirClienteOutPutPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InserirClienteUseCase implements InserirClienteInputPort {

    private BuscarEnderecoPorCep buscarEnderecoPorCep;

    private InserirClienteOutPutPort inserirClienteOutPutPort;

    private EnviarCpfValidacaoOutputPort enviarCpfValidacaoOutputPort;

    @Override
    public void inserir(Cliente cliente, String cep) {
        Endereco endereco = buscarEnderecoPorCep.buscar(cep);
        cliente.setEndereco(endereco);
        inserirClienteOutPutPort.inserir(cliente);
        enviarCpfValidacaoOutputPort.enviar(cliente.getCpf());
    }

}

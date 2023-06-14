package arquitetura.hexagonal.application.core.usecase;

import arquitetura.hexagonal.application.core.domain.Cliente;
import arquitetura.hexagonal.application.ports.in.BuscarClienteIdInputPort;
import arquitetura.hexagonal.application.ports.out.BuscarClienteIdOutPutPort;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
public class BuscarClienteIdUseCase implements BuscarClienteIdInputPort {


    private BuscarClienteIdOutPutPort buscarClienteIdOutPutPort;

    @Override
    public Cliente buscar(String id){
        return buscarClienteIdOutPutPort.buscar(id).orElseThrow(() -> new RuntimeException("Não encontrado"));
    }


}

package arquitetura.hexagonal.config;

import arquitetura.hexagonal.application.core.usecase.AtualizarClienteUseCase;
import arquitetura.hexagonal.application.core.usecase.BuscarClienteIdUseCase;
import arquitetura.hexagonal.application.ports.in.AtualizarClienteInputPort;
import arquitetura.hexagonal.application.ports.in.BuscarClienteIdInputPort;
import arquitetura.hexagonal.application.ports.out.AtualizarClienteOutputPort;
import arquitetura.hexagonal.application.ports.out.BuscarClienteIdOutPutPort;
import arquitetura.hexagonal.application.ports.out.BuscarEnderecoPorCep;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AtualizarClienteConfig {

    @Bean
    public AtualizarClienteUseCase atualizarClienteUseCase(BuscarClienteIdInputPort buscarClienteIdInputPort,
                                                           BuscarEnderecoPorCep buscarEnderecoPorCep,
                                                           AtualizarClienteOutputPort atualizarClienteOutputPort) {
        return new AtualizarClienteUseCase(buscarClienteIdInputPort, buscarEnderecoPorCep, atualizarClienteOutputPort);

    }
}

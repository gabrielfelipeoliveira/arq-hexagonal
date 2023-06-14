package arquitetura.hexagonal.config;

import arquitetura.hexagonal.adapters.out.BuscarEnderecoPorCepAdapter;
import arquitetura.hexagonal.application.core.usecase.BuscarClienteIdUseCase;
import arquitetura.hexagonal.application.core.usecase.InserirClienteUseCase;
import arquitetura.hexagonal.application.ports.out.BuscarClienteIdOutPutPort;
import arquitetura.hexagonal.application.ports.out.InserirClienteOutPutPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarClienteConfig {

    @Bean
    public BuscarClienteIdUseCase inserirClienteUseCase(BuscarClienteIdOutPutPort buscarClienteIdOutPutPort) {
        return new BuscarClienteIdUseCase(buscarClienteIdOutPutPort);

    }
}

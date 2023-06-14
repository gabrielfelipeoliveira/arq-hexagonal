package arquitetura.hexagonal.config;

import arquitetura.hexagonal.adapters.out.BuscarEnderecoPorCepAdapter;
import arquitetura.hexagonal.adapters.out.EnviarCpfValidacaoAdapter;
import arquitetura.hexagonal.application.core.usecase.InserirClienteUseCase;
import arquitetura.hexagonal.application.ports.out.InserirClienteOutPutPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InserirClienteConfig {

    @Bean
    public InserirClienteUseCase inserirClienteUseCase(BuscarEnderecoPorCepAdapter buscarEnderecoPorCepAdapter,
                                                       InserirClienteOutPutPort inserirClienteOutPutPort,
                                                       EnviarCpfValidacaoAdapter enviarCpfValidacaoAdapter) {
        return new InserirClienteUseCase(buscarEnderecoPorCepAdapter, inserirClienteOutPutPort, enviarCpfValidacaoAdapter);

    }
}

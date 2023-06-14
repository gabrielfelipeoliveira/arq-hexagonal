package arquitetura.hexagonal.adapters.out.client;

import arquitetura.hexagonal.adapters.out.client.response.EnderecoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="BuscarPorEnderecoClient",
url = "${url.busca.endereco}")
public interface BuscarPorEnderecoClient {

    @GetMapping("/{cep]")
    EnderecoResponse buscar(String cep);


}

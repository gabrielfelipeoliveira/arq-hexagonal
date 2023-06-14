package arquitetura.hexagonal.adapters.out.client.response;

import lombok.Data;

@Data
public class EnderecoResponse {

    private String rua;
    private String cidade;
    private String estado;
}

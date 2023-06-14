package arquitetura.hexagonal.adapters.in.controller.response;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClienteResponse {

    @NotBlank
    private String nome;
    @NotBlank
    private String cpf;
    @NotBlank
    private String cep;
}

package arquitetura.hexagonal.adapters.in.consumer.message;

import arquitetura.hexagonal.application.core.domain.Endereco;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteMensagem {


    private String id;
    private String nome;
    private String cpf;
    private boolean cpfValido;
    private String cep;
}

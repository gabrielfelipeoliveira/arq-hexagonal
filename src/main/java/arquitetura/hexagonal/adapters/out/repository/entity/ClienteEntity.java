package arquitetura.hexagonal.adapters.out.repository.entity;

import arquitetura.hexagonal.application.core.domain.Endereco;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "clientes")
public class ClienteEntity {

    @Id
    private String id;
    private String nome;
    private EnderecoEntity endereco;
    private String cpf;
    private boolean cpfValido;
}

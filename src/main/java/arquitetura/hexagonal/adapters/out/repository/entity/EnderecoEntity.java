package arquitetura.hexagonal.adapters.out.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class EnderecoEntity {

    private String rua;
    private String cidade;
    private String estado;
}

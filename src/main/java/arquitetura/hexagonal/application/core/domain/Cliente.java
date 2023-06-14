package arquitetura.hexagonal.application.core.domain;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class Cliente {

    private String id;
    private String nome;
    private Endereco endereco;
    private String cpf;
    private boolean cpfValido;
}

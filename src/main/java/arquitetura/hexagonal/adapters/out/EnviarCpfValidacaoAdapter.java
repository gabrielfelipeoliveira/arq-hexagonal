package arquitetura.hexagonal.adapters.out;

import arquitetura.hexagonal.application.ports.out.EnviarCpfValidacaoOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class EnviarCpfValidacaoAdapter implements EnviarCpfValidacaoOutputPort {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Override
    public void enviar(String cpf) {
        kafkaTemplate.send("topic-cpf-validation", cpf);
    }
}

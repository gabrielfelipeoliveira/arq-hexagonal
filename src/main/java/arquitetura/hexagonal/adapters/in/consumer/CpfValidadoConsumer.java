package arquitetura.hexagonal.adapters.in.consumer;

import arquitetura.hexagonal.adapters.in.consumer.mapper.ClienteMensagemMapper;
import arquitetura.hexagonal.adapters.in.consumer.message.ClienteMensagem;
import arquitetura.hexagonal.application.ports.in.AtualizarClienteInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

public class CpfValidadoConsumer {


    @Autowired
    private AtualizarClienteInputPort atualizarClienteInputPort;

    @Autowired
    private ClienteMensagemMapper clienteMensagemMapper;

    @KafkaListener(topics = "topic-cpf-validated", groupId = "hexagonal")
    public void receber(ClienteMensagem clienteMensagem){
        atualizarClienteInputPort.atualizar(clienteMensagemMapper.toCliente(clienteMensagem),clienteMensagem.getCep());
    }
}

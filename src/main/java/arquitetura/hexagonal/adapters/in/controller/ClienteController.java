package arquitetura.hexagonal.adapters.in.controller;

import arquitetura.hexagonal.adapters.in.controller.mapper.ClienteMapper;
import arquitetura.hexagonal.adapters.in.controller.request.ClienteRequest;
import arquitetura.hexagonal.adapters.in.controller.response.ClienteResponse;
import arquitetura.hexagonal.adapters.out.InserirClienteAdapter;
import arquitetura.hexagonal.application.core.domain.Cliente;
import arquitetura.hexagonal.application.ports.in.AtualizarClienteInputPort;
import arquitetura.hexagonal.application.ports.in.BuscarClienteIdInputPort;
import arquitetura.hexagonal.application.ports.in.InserirClienteInputPort;
import arquitetura.hexagonal.application.ports.out.InserirClienteOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    @Autowired
    private ClienteMapper clienteMapper;

    @Autowired
    private InserirClienteInputPort inserirClienteInputPort;

    @Autowired
    private BuscarClienteIdInputPort buscarClienteIdInputPort;

    @Autowired
    private AtualizarClienteInputPort atualizarClienteInputPort;

    @PostMapping
    public void inserir(ClienteRequest clienteRequest) {
        inserirClienteInputPort.inserir(clienteMapper.toCliente(clienteRequest), clienteRequest.getCep());
    }

    @GetMapping("/{id}")
    public ClienteResponse buscarPorId(@PathVariable String id) {
        return clienteMapper.toClienteResponse(buscarClienteIdInputPort.buscar(id));
    }

    @PutMapping("/{id}")
    public void buscarPorId(@RequestBody ClienteRequest clienteRequest, @PathVariable String id) {
        Cliente cliente = clienteMapper.toCliente(clienteRequest);
        cliente.setId(id);
        atualizarClienteInputPort.atualizar(cliente, clienteRequest.getCep());
    }
}

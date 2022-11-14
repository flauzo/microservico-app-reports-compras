package com.flauzo.msrelatoriocompras.controller.impl;

import com.flauzo.msrelatoriocompras.controller.interfaces.ClienteController;
import com.flauzo.msrelatoriocompras.entity.ClienteTopDTO;
import com.flauzo.msrelatoriocompras.entity.RecomendacaoVinhoDTO;
import com.flauzo.msrelatoriocompras.service.interfaces.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteControllerImpl implements ClienteController {

    private final ClienteService clienteService;

    public ClienteControllerImpl(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/clientes-fieis")
    @Override
    public List<ClienteTopDTO> obterClientesFieis() {
        return clienteService.obterClientesFieis();
    }

    @GetMapping("/recomendacao/{clientId}/{tipo}")
    @Override
    public RecomendacaoVinhoDTO obterRecomendacaoParaCliente(@PathVariable Integer clientId, @PathVariable String tipo) {
        return clienteService.obterRecomendacaoParaCliente(clientId, tipo);
    }
}

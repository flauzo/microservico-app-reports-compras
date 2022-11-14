package com.flauzo.msrelatoriocompras.controller.interfaces;

import com.flauzo.msrelatoriocompras.entity.ClienteTopDTO;
import com.flauzo.msrelatoriocompras.entity.RecomendacaoVinhoDTO;

import java.util.List;

public interface ClienteController {

    List<ClienteTopDTO> obterClientesFieis();

    RecomendacaoVinhoDTO obterRecomendacaoParaCliente(Integer clientId, String tipo);
}

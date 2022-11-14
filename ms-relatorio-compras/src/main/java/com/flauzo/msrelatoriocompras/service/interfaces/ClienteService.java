package com.flauzo.msrelatoriocompras.service.interfaces;

import com.flauzo.msrelatoriocompras.entity.ClienteTopDTO;
import com.flauzo.msrelatoriocompras.entity.RecomendacaoVinhoDTO;

import java.util.List;

public interface ClienteService {

    List<ClienteTopDTO> obterClientesFieis();

    RecomendacaoVinhoDTO obterRecomendacaoParaCliente(Integer clientId, String tipo);
}

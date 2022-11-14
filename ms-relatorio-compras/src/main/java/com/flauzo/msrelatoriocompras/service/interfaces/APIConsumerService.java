package com.flauzo.msrelatoriocompras.service.interfaces;

import com.flauzo.msrelatoriocompras.entity.Cliente;
import com.flauzo.msrelatoriocompras.entity.Compra;

import java.util.List;

public interface APIConsumerService {

    List<Compra> consumirAPIEndpointCompras();

    List<Cliente> consumirAPIEndpointClientes();
}

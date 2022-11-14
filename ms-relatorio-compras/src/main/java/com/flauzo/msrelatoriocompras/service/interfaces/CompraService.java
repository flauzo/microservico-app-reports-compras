package com.flauzo.msrelatoriocompras.service.interfaces;

import com.flauzo.msrelatoriocompras.entity.Compra;

import java.util.List;

public interface CompraService {

    List<Compra> obterCompras();

    Compra obterMaiorCompraDoAno(String ano);
}

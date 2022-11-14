package com.flauzo.msrelatoriocompras.controller.interfaces;

import com.flauzo.msrelatoriocompras.entity.Compra;

import java.util.List;

public interface CompraController {

    List<Compra> obterCompras();

    Compra obterMaiorCompraDoAno( String ano);
}

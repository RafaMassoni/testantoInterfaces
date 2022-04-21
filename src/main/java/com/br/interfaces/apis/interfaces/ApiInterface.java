package com.br.interfaces.apis.interfaces;

import com.br.interfaces.apis.enumerator.TipoApiEnumerator;

public interface ApiInterface extends ApiIntegracaoInterface, ApiValidacaoInterface {


    default ApiInterface validarTipoAPI(TipoApiEnumerator tipoAPI)
    {

        if (tipoDaApi().equals(tipoAPI))
            return this;
        else if (proximoAPIaSerValidada() == null)
            throw new RuntimeException("Esse tipo de API ainda não foi implementado");
        else
            return proximoAPIaSerValidada().validarTipoAPI( tipoAPI );


    }

}

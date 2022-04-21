package com.br.interfaces.apis;

import com.br.interfaces.apis.enumerator.TipoApiEnumerator;
import com.br.interfaces.apis.implementacoes.ApiIntegracaoDadosFixosImp;
import com.br.interfaces.apis.interfaces.ApiInterface;

public class ApiFactory {


    public static ApiInterface criarApi(TipoApiEnumerator tipoApi )
    {
        ApiInterface api = new ApiIntegracaoDadosFixosImp();

        return api.validarTipoAPI( tipoApi );
    }



}

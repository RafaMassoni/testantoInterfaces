package com.br.interfaces.apis.implementacoes;

import com.br.interfaces.apis.enumerator.TipoApiEnumerator;
import com.br.interfaces.apis.interfaces.ApiInterface;

import java.util.ArrayList;
import java.util.List;

public class ApiIntegracaoDadosFixosImp implements ApiInterface {


    public void conectar(){
        System.out.println("CONECTADO A DADOS FIXOS");
    }


    public List<String> buscarDados(){

        List<String> lista = new ArrayList<>();
        lista.add("NOTÍCIA 1");
        lista.add("NOTÍCIA 2");
        lista.add("NOTÍCIA 3");
        lista.add("NOTÍCIA 4");

        return lista;

    }


    @Override
    public ApiInterface proximoAPIaSerValidada() {
        return new ApiIntegracaoDadosFixosInversoImp();
    }

    @Override
    public TipoApiEnumerator tipoDaApi() {
        return TipoApiEnumerator.DADOS_FIXOS;
    }
}

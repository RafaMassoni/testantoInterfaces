package com.br.interfaces.apis.implementacoes;

import com.br.interfaces.apis.enumerator.TipoApiEnumerator;
import com.br.interfaces.apis.interfaces.ApiInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ApiIntegracaoDadosAleatoriosImp implements ApiInterface {


    public void conectar(){
        System.out.println("CONECTADO A DADOS ALEATORIOS");
    }


    public List<String> buscarDados(){

        List<String> lista = new ArrayList<>();

        Random random = new Random();
        int numeroNoticias = random.nextInt(10);

        for (int i = 0; i < numeroNoticias; i++)
            lista.add(gerarNoticia());

        return lista;

    }


    private String gerarNoticia()
    {
        Random random = new Random();
            return "NOTÍCIA " + random.nextInt(20);
    }

    @Override
    public ApiInterface proximoAPIaSerValidada() {
        return null;
    }

    @Override
    public TipoApiEnumerator tipoDaApi() {
        return TipoApiEnumerator.DADOS_ALEATORIOS;
    }
}

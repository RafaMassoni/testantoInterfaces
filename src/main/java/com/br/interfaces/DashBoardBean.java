package com.br.interfaces;


import com.br.interfaces.apis.enumerator.TipoApiEnumerator;
import com.br.interfaces.apis.interfaces.ApiIntegracaoInterface;
import com.br.interfaces.apis.ApiFactory;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class DashBoardBean implements Serializable {


    private ApiIntegracaoInterface api;
    private List<String> dados = new ArrayList<>();

    private TipoApiEnumerator tipoApiSelecionado;


    @PostConstruct
    public void inicializar()
    {

        tipoApiSelecionado = TipoApiEnumerator.DADOS_FIXOS;
        selecinarTipoDeAPI();

    }


    public void selecinarTipoDeAPI()
    {

        api = ApiFactory.criarApi(tipoApiSelecionado);
        api.conectar();

    }

    public void buscarDados()
    {

         dados = api.buscarDados();

    }


    public List<String> getDados() {
        return dados;
    }

    public TipoApiEnumerator[] getTipoApiParaSelecao()
    {
        return TipoApiEnumerator.values();
    }

    public TipoApiEnumerator getTipoApiSelecionado() {
        return tipoApiSelecionado;
    }

    public void setTipoApiSelecionado(TipoApiEnumerator tipoApiSelecionado) {
        this.tipoApiSelecionado = tipoApiSelecionado;
    }
}

package com.br.interfaces.apis.enumerator;

public enum TipoApiEnumerator {

    DADOS_FIXOS("Dados fixos"),
    DADOS_FIXOS_INVERSO("Dados fixos na ordem inversa"),
    DADOS_ALEATORIOS("Dados gerados aleatóriamente");

    private final String descricao;

    TipoApiEnumerator(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

package com.adr.grainbroker.model;

public class Demanda {
    long userId;
    private String commodities;
    private int preco;
    private String descricao;
    private String local;

    public String getCommodities() {
        return commodities;
    }

    public void setCommodities(String commodities) {
        this.commodities = commodities;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}

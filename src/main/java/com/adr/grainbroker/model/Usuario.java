package com.adr.grainbroker.model;

import java.util.List;

public class Usuario {
    long id;
    private String nome;
    private int cpf;
    private Contato contato;
    private TipoUsuario tipoUsuario;
    private List<Oferta> ofertas;
    private List<Demanda> demandas;

    public Usuario(String nome, int cpf, Contato contato, TipoUsuario tipoUsuario)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
        this.tipoUsuario = tipoUsuario;
    }

    public void AddOferta(Oferta oferta)
    {
        ofertas.add(oferta);
    }

    public void AddDemanda(Demanda demanda)
    {
        demandas.add(demanda);
    }

}

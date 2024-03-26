package com.adr.grainbroker.domain.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private String nome;
    private int cpf;
    @OneToOne(cascade = CascadeType.ALL )
    private Contato contato;
    @OneToOne(cascade = CascadeType.ALL )
    private TipoUsuario tipoUsuario;
    @OneToMany(cascade = CascadeType.ALL )
    private List<Oferta> ofertas;
    @OneToMany(cascade = CascadeType.ALL )
    private List<Demanda> demandas;
    public Usuario(){

    }

    public void AddOferta(Oferta oferta) {
        ofertas.add(oferta);
    }

    public void AddDemanda(Demanda demanda) {
        demandas.add(demanda);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public List<Oferta> getOfertas() {
        return ofertas;
    }

    public void setOfertas(List<Oferta> ofertas) {
        this.ofertas = ofertas;
    }

    public List<Demanda> getDemandas() {
        return demandas;
    }

    public void setDemandas(List<Demanda> demandas) {
        this.demandas = demandas;
    }
}

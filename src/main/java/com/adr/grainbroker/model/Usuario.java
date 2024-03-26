package com.adr.grainbroker.model;

import jakarta.persistence.*;
import org.hibernate.engine.jdbc.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private String nome;
    @Column(length = 11)
    private int cpf;
    @OneToOne(cascade = CascadeType.ALL )
    private Contato contato;
    @OneToOne(cascade = CascadeType.ALL )
    private TipoUsuario tipoUsuario;
    @OneToMany(cascade = CascadeType.ALL )
    private List<Oferta> ofertas;
    @OneToMany(cascade = CascadeType.ALL )
    private List<Demanda> demandas;

    public Usuario(String nome, int cpf, Contato contato, TipoUsuario tipoUsuario) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
        this.tipoUsuario = tipoUsuario;
        this.ofertas = new ArrayList<Oferta>();
        this.demandas = new ArrayList<Demanda>();
    }

    public Usuario() {

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

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public Contato getContato() {
        return contato;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public List<Oferta> getOfertas() {
        return ofertas;
    }

    public List<Demanda> getDemandas() {
        return demandas;
    }

}

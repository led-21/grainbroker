package com.adr.grainbroker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TipoUsuario {
    @Id
    long userId;
    private String tipoUsuario;
    private String empresa;

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}

package com.adr.grainbroker.service.impl;

import com.adr.grainbroker.domain.model.Usuario;
import com.adr.grainbroker.domain.repository.RepositorioUsuario;
import com.adr.grainbroker.service.ServicoUsuario;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ServicoUsuarioImpl implements ServicoUsuario {
    private final RepositorioUsuario repositorioUsuario;

    public ServicoUsuarioImpl(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    @Override
    public Usuario findById(long id) {
        return repositorioUsuario.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Usuario create(Usuario usuarioParaCriar) {
        if (usuarioParaCriar != null && repositorioUsuario.existsById(usuarioParaCriar.getId())) {
            throw new IllegalArgumentException("Usuário já existe");
        }
        return repositorioUsuario.save(usuarioParaCriar);
    }
}

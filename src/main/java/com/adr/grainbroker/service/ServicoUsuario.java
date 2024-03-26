package com.adr.grainbroker.service;

import com.adr.grainbroker.domain.model.Usuario;

public interface ServicoUsuario {
    Usuario findById(long id);

    Usuario create(Usuario usuarioParaCriar);
}

package br.com.teste.cadastroUsuarios.usecases;

import br.com.teste.cadastroUsuarios.core.entities.User;

public interface CreateUserUseCase {
    void criarUsuario(User usuario);
}

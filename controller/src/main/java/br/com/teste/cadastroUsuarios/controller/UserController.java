package br.com.teste.cadastroUsuarios.controller;

import br.com.teste.cadastroUsuarios.core.entities.User;
import br.com.teste.cadastroUsuarios.usecases.CreateUserUseCaseImpl;

public class UserController {
    private final CreateUserUseCaseImpl createUserUseCase;

    public UserController(CreateUserUseCaseImpl createUserUseCase) {
        this.createUserUseCase = createUserUseCase;
    }

    public void criarUsuario(String nome){
        User user = new User(nome);
        createUserUseCase.criarUsuario(user);
    }
}

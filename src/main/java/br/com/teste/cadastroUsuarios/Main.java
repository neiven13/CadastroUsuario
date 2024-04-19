package br.com.teste.cadastroUsuarios;


import br.com.teste.cadastroUsuarios.application.UserRepositoryImpl;
import br.com.teste.cadastroUsuarios.controller.UserController;
import br.com.teste.cadastroUsuarios.usecases.CreateUserUseCase;
import br.com.teste.cadastroUsuarios.usecases.CreateUserUseCaseImpl;
import br.com.teste.cadastroUsuarios.usecases.UserRepository;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryImpl();
        CreateUserUseCase createUserUseCase = new CreateUserUseCaseImpl(userRepository);
        UserController userController = new UserController((CreateUserUseCaseImpl) createUserUseCase);
        userController.criarUsuario("Beatriz");

    }
}
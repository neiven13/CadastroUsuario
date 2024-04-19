package br.com.teste.cadastroUsuarios.usecases;

import br.com.teste.cadastroUsuarios.core.entities.User;

public class CreateUserUseCaseImpl implements CreateUserUseCase{
    private final UserRepository userRepository;

    public CreateUserUseCaseImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void criarUsuario(User user) {
        userRepository.criarUsuario(user);
    }
}

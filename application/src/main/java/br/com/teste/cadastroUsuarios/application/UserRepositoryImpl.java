package br.com.teste.cadastroUsuarios.application;

import br.com.teste.cadastroUsuarios.core.entities.User;
import br.com.teste.cadastroUsuarios.usecases.UserRepository;
import io.github.cdimascio.dotenv.Dotenv;

import java.sql.*;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public void criarUsuario(User user) {
        Dotenv dotenv = Dotenv.load();

        String username = dotenv.get("DB_USERNAME");
        String password = dotenv.get("DB_PASSWORD");
        String url = dotenv.get("DB_URL");

        try (Connection conexao = DriverManager.getConnection(url,username,password)){
            String sql = "INSERT INTO users values (NULL,?,?)";
            try {
                PreparedStatement pst = conexao.prepareStatement(sql);
                Date data = Date.valueOf(user.getCriadoEm());
                pst.setString(1, user.getNome());
                pst.setDate(2, data);
                pst.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

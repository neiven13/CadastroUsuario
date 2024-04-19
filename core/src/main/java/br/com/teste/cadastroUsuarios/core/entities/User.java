package br.com.teste.cadastroUsuarios.core.entities;

import java.time.LocalDate;

public class User {
    private String nome;
    private LocalDate criadoEm;

    public User(String nome) {
        this.nome = nome;
        this.criadoEm = LocalDate.now();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getCriadoEm() {
        return criadoEm;
    }
}

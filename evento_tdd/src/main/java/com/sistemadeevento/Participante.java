
package com.sistemadeevento;

public class Participante {

    private String codigo;
    private String nome;
    private String email;

    // Construtor
    public Participante(String codigo, String nome, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
    }

    // Getter do código
    public String getCodigo() {
        return codigo;
    }

    // Getter do nome
    public String getNome() {
        return nome;
    }

    // Getter do e-mail
    public String getEmail() {
        return email;
    }

    // Setter do nome
    public void setNome(String nome) {
        validarNome(nome);
        this.nome = nome;
    }

    // Setter do código
    public void setCodigo(String codigo) {
        validarCodigo(codigo);
        this.codigo = codigo;
    }

    // Setter do e-mail
    public void setEmail(String email) {
        validarEmail(email);
        this.email = email;
    }

    // Atualizar todos os dados do participante
    public void atualizarDados(String codigo, String nome, String email) {

        validarCodigo(codigo);
        validarNome(nome);
        validarEmail(email);

        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
    }

    // Validação do código
    private void validarCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Código inválido.");
        }
    }

    // Validação do nome
    private void validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido.");
        }
    }

    // Validação do e-mail
    private void validarEmail(String email) {
        if (email == null || email.trim().isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("E-mail inválido.");
        }
    }
}
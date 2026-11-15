package com.sistemadeevento;

public class Participante {

    // Atributos
    private String codigo;
    private String nome;
    private String email;

    // Construtor
    public Participante(String codigo, String nome, String email) {
        this.codigo = codigo;
        setNome(nome);
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

    // Setter do nome com validação
    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException(
                "O nome do participante não pode ficar em branco."
            );
        }

        this.nome = nome;
    }

    // Getter do e-mail
    public String getEmail() {
        return email;
    }

    // Setter do e-mail
    public void setEmail(String email) {
        this.email = email;
    }
}

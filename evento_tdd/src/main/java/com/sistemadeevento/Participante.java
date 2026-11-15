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
    public void setNome(String nome) {
    this.nome = nome;
    }
    
    // Setter do código
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Código inválido.");
        }

        this.codigo = codigo;
    }

    // Setter do e-mail
    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("E-mail inválido.");
        }

        this.email = email;
    }


}
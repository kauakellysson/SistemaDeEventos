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
}
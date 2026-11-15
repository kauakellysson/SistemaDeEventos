package com.sistemadeevento;

/**
 * Representa um participante do sistema de eventos.
 */
public class Participante {

    private String codigo;
    private String nome;
    private String email;

    /**
     * Cria um participante.
     *
     * @param codigo código do participante
     * @param nome nome do participante
     * @param email e-mail do participante
     */
    public Participante(String codigo, String nome, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
    }

    /**
     * Retorna o código.
     *
     * @return código do participante
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Retorna o nome.
     *
     * @return nome do participante
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o e-mail.
     *
     * @return e-mail do participante
     */
    public String getEmail() {
        return email;
    }

    /**
     * Altera o nome após a validação.
     *
     * @param novoNome novo nome
     */
    public void setNome(String novoNome) {
        validarNome(novoNome);
        this.nome = novoNome;
    }

    /**
     * Altera o código após a validação.
     *
     * @param novoCodigo novo código
     */
    public void setCodigo(String novoCodigo) {
        validarCodigo(novoCodigo);
        this.codigo = novoCodigo;
    }

    /**
     * Altera o e-mail após a validação.
     *
     * @param novoEmail novo e-mail
     */
    public void setEmail(String novoEmail) {
        validarEmail(novoEmail);
        this.email = novoEmail;
    }

    /**
     * Atualiza os dados após validar todos os valores.
     *
     * @param novoCodigo novo código
     * @param novoNome novo nome
     * @param novoEmail novo e-mail
     */
    public void atualizarDados(
            String novoCodigo, String novoNome, String novoEmail) {
        validarCodigo(novoCodigo);
        validarNome(novoNome);
        validarEmail(novoEmail);

        this.codigo = novoCodigo;
        this.nome = novoNome;
        this.email = novoEmail;
    }

    private void validarCodigo(String codigoInformado) {
        if (codigoInformado == null || codigoInformado.trim().isEmpty()) {
            throw new IllegalArgumentException("Código inválido.");
        }
    }

    private void validarNome(String nomeInformado) {
        if (nomeInformado == null || nomeInformado.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido.");
        }
    }

    private void validarEmail(String emailInformado) {
        if (emailInformado == null
                || emailInformado.trim().isEmpty()
                || !emailInformado.contains("@")) {
            throw new IllegalArgumentException("E-mail inválido.");
        }
    }
}
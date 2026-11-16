
package com.sistemadeevento;

/**
 * Representa um participante de um evento.
 * Armazena código, nome e e-mail do participante.
 */
public class Participante {

    private String codigo;
    private String nome;
    private String email;

    /**
     * Cria um participante com seus dados iniciais.
     *
     * @param novoCodigo código do participante
     * @param novoNome nome do participante
     * @param novoEmail e-mail do participante
     */
    public Participante(
            String novoCodigo, String novoNome, String novoEmail) {
        this.codigo = novoCodigo;
        this.nome = novoNome;
        this.email = novoEmail;
    }

    /**
     * Retorna o código do participante.
     *
     * @return código do participante
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Retorna o nome do participante.
     *
     * @return nome do participante
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o e-mail do participante.
     *
     * @return e-mail do participante
     */
    public String getEmail() {
        return email;
    }

    /**
     * Altera o nome do participante.
     *
     * @param novoNome novo nome do participante
     */
    public void setNome(String novoNome) {
        validarNome(novoNome);
        this.nome = novoNome;
    }

    /**
     * Altera o código do participante.
     *
     * @param novoCodigo novo código do participante
     */
    public void setCodigo(String novoCodigo) {
        validarCodigo(novoCodigo);
        this.codigo = novoCodigo;
    }

    /**
     * Altera o e-mail do participante.
     *
     * @param novoEmail novo e-mail do participante
     */
    public void setEmail(String novoEmail) {
        validarEmail(novoEmail);
        this.email = novoEmail;
    }

    /**
     * Atualiza todos os dados do participante.
     *
     * @param novoCodigo novo código do participante
     * @param novoNome novo nome do participante
     * @param novoEmail novo e-mail do participante
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

    /**
     * Valida o código informado.
     *
     * @param valorCodigo código que será validado
     * @throws IllegalArgumentException se o código for inválido
     */
    private void validarCodigo(String valorCodigo) {
        if (valorCodigo == null || valorCodigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Código inválido.");
        }
    }

    /**
     * Valida o nome informado.
     *
     * @param valorNome nome que será validado
     * @throws IllegalArgumentException se o nome for inválido
     */
    private void validarNome(String valorNome) {
        if (valorNome == null || valorNome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido.");
        }
    }

    /**
     * Valida o e-mail informado.
     *
     * @param valorEmail e-mail que será validado
     * @throws IllegalArgumentException se o e-mail for inválido
     */
    private void validarEmail(String valorEmail) {
        if (valorEmail == null
                || valorEmail.trim().isEmpty()
                || !valorEmail.contains("@")) {
            throw new IllegalArgumentException("E-mail inválido.");
        }
    }
}

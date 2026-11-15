package com.sistemadeevento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Mantém o cadastro de participantes.
 */
public class CadastroDeParticipantes {

    private final Map<String, Participante> participantes = new HashMap<>();

    /**
     * Cadastra um participante sem permitir códigos duplicados.
     *
     * @param participante participante que será cadastrado
     * @throws IllegalArgumentException se for nulo ou o código já existir
     */
    public void cadastrar(Participante participante) {
        if (participante == null) {
            throw new IllegalArgumentException(
                    "O participante não pode ser nulo.");
        }

        String codigo = participante.getCodigo();

        if (participantes.containsKey(codigo)) {
            throw new IllegalArgumentException(
                    "Já existe um participante com esse código.");
        }

        participantes.put(codigo, participante);
    }

    /**
     * Busca um participante pelo código.
     *
     * @param codigo código procurado
     * @return participante encontrado ou null se não estiver cadastrado
     */
    public Participante buscarPorCodigo(String codigo) {
        return participantes.get(codigo);
    }

    /**
     * Retorna uma cópia da lista de participantes cadastrados.
     *
     * @return lista dos participantes, sem ordem garantida
     */
    public List<Participante> listar() {
        return new ArrayList<>(participantes.values());
    }

}

package com.sistemadeevento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Testes do cadastro de participantes.
 */
class CadastroDeParticipantesTest {

    @Test
    void deveImpedirCadastroDeCodigoDuplicado() {
        CadastroDeParticipantes cadastro = new CadastroDeParticipantes();
        Participante primeiro = new Participante(
            "001", "João", "joao@email.com"
        );
        Participante segundo = new Participante(
            "001", "Maria", "maria@email.com"
        );

        cadastro.cadastrar(primeiro);

        assertThrows(
            IllegalArgumentException.class,
            () -> cadastro.cadastrar(segundo)
        );
    }
}

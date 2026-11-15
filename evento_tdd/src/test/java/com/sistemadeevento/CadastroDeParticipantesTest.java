package com.sistemadeevento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Testes do cadastro de participantes.
 */
class CadastroDeParticipantesTest {

    @Test
    void deveImpedirCadastroDeCodigoDuplicado() {
        CadastroDeParticipantes cadastro = new CadastroDeParticipantes();
        Participante primeiro = new Participante(
                "001", "João", "joao@email.com");
        Participante segundo = new Participante(
                "001", "Maria", "maria@email.com");

        cadastro.cadastrar(primeiro);

        assertThrows(
                IllegalArgumentException.class,
                () -> cadastro.cadastrar(segundo));
    }

    @Test
    void deveRecusarParticipanteNulo() {
        CadastroDeParticipantes cadastro = new CadastroDeParticipantes();

        assertThrows(
                IllegalArgumentException.class,
                () -> cadastro.cadastrar(null));
    }

    @Test
    void devePermitirCadastroDeCodigosDiferentes() {
        CadastroDeParticipantes cadastro = new CadastroDeParticipantes();
        Participante primeiro = new Participante(
                "001", "João", "joao@email.com");
        Participante segundo = new Participante(
                "002", "Maria", "maria@email.com");

        assertDoesNotThrow(() -> {
            cadastro.cadastrar(primeiro);
            cadastro.cadastrar(segundo);
        });
    }

    @Test
    void deveBuscarParticipantePeloCodigo() {
        CadastroDeParticipantes cadastro = new CadastroDeParticipantes();
        Participante participante = new Participante(
                "001", "João", "joao@email.com");

        cadastro.cadastrar(participante);

        assertSame(participante, cadastro.buscarPorCodigo("001"));
    }

    @Test
    void deveRetornarNuloAoBuscarEmCadastroVazio() {
        CadastroDeParticipantes cadastro = new CadastroDeParticipantes();

        assertNull(cadastro.buscarPorCodigo("001"));
    }

    @Test
    void deveRetornarNuloParaCodigoNaoCadastrado() {
        CadastroDeParticipantes cadastro = new CadastroDeParticipantes();
        Participante participante = new Participante(
                "001", "João", "joao@email.com");

        cadastro.cadastrar(participante);

        assertNull(cadastro.buscarPorCodigo("999"));
    }

    @Test
    void deveListarCadastroVazio() {
        CadastroDeParticipantes cadastro = new CadastroDeParticipantes();

        assertTrue(cadastro.listar().isEmpty());
    }

    @Test
    void deveListarTodosOsParticipantes() {
        CadastroDeParticipantes cadastro = new CadastroDeParticipantes();
        Participante primeiro = new Participante(
                "001", "João", "joao@email.com");
        Participante segundo = new Participante(
                "002", "Maria", "maria@email.com");

        cadastro.cadastrar(primeiro);
        cadastro.cadastrar(segundo);

        assertEquals(2, cadastro.listar().size());
        assertTrue(cadastro.listar().contains(primeiro));
        assertTrue(cadastro.listar().contains(segundo));
    }

    @Test
    void limparListaRetornadaNaoDeveExcluirParticipantes() {
        CadastroDeParticipantes cadastro = new CadastroDeParticipantes();
        Participante participante = new Participante(
                "001", "João", "joao@email.com");

        cadastro.cadastrar(participante);
        cadastro.listar().clear();

        assertSame(participante, cadastro.buscarPorCodigo("001"));
        assertEquals(1, cadastro.listar().size());
    }

}

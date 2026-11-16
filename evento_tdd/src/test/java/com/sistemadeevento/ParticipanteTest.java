import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class ParticipanteTest {

    @Test
    void deveCriarParticipanteComDadosValidos() {
        assertDoesNotThrow(() ->
            new Participante("P001", "Ana", "ana@email.com")
        );
    }
}
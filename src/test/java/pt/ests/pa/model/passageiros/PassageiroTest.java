package pt.ests.pa.model.passageiros;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Testes unitários para a hierarquia de classes Passageiro / Crianca / Adulto / Idoso.
 */
class PassageiroTest {

    @Test
    void construtorGuardaOrigemDestinoEInstante() {
        Passageiro passageiro = new Adulto(0, 5, 10);

        assertEquals(0, passageiro.getPisoOrigem());
        assertEquals(5, passageiro.getPisoDestino());
        assertEquals(10, passageiro.getInstanteCriacao());
    }

    @Test
    void cadaSubclasseTemAPrioridadeCorreta() {
        Passageiro idoso = new Idoso(0, 1, 0);
        Passageiro crianca = new Crianca(0, 1, 0);
        Passageiro adulto = new Adulto(0, 1, 0);

        assertTrue(idoso.getPrioridade() > crianca.getPrioridade());
        assertTrue(crianca.getPrioridade() > adulto.getPrioridade());
    }

    @Test
    void doisPassageirosTemIdsDiferentes() {
        Passageiro p1 = new Adulto(0, 1, 0);
        Passageiro p2 = new Adulto(0, 1, 0);

        assertNotEquals(p1.getId(), p2.getId());
    }

    @Test
    void ordenacaoNaturalRespeitaPrioridadeDeEmbarque() {
        Passageiro adulto = new Adulto(0, 1, 0);
        Passageiro crianca = new Crianca(0, 1, 0);
        Passageiro idoso = new Idoso(0, 1, 0);

        List<Passageiro> passageiros = new ArrayList<>(List.of(adulto, crianca, idoso));
        Collections.sort(passageiros);

        // Ordem esperada apos ordenar: Idoso (mais prioritario) primeiro, Adulto por ultimo.
        assertEquals(idoso, passageiros.get(0));
        assertEquals(crianca, passageiros.get(1));
        assertEquals(adulto, passageiros.get(2));
    }

    @Test
    void equalsBaseiaSeApenasNoId() {
        Passageiro p1 = new Adulto(0, 1, 0);
        Passageiro p2 = new Idoso(2, 3, 5);

        assertEquals(p1, p1);
        assertFalse(p1.equals(p2));
        assertFalse(p1.equals(null));
        assertFalse(p1.equals("não é um passageiro"));
    }

    @Test
    void toStringIncluiONomeDoTipoConcreto() {
        Passageiro idoso = new Idoso(0, 1, 0);

        assertTrue(idoso.toString().contains("Idoso"));
    }
}

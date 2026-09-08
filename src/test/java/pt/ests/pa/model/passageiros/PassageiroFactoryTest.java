package pt.ests.pa.model.passageiros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Testes unitários para o padrão criacional PassageiroFactory.
 */
class PassageiroFactoryTest {

    private final PassageiroFactory factory = new PassageiroFactory();

    @Test
    void criarPassageiroDevolveASubclasseCorretaParaCadaTipo() {
        assertInstanceOf(Crianca.class, factory.criarPassageiro(TipoPassageiro.CRIANCA, 0, 1, 0));
        assertInstanceOf(Adulto.class, factory.criarPassageiro(TipoPassageiro.ADULTO, 0, 1, 0));
        assertInstanceOf(Idoso.class, factory.criarPassageiro(TipoPassageiro.IDOSO, 0, 1, 0));
    }

    @Test
    void criarPassageiroPropagaOrigemDestinoEInstante() {
        Passageiro passageiro = factory.criarPassageiro(TipoPassageiro.ADULTO, 2, 7, 15);

        assertEquals(2, passageiro.getPisoOrigem());
        assertEquals(7, passageiro.getPisoDestino());
        assertEquals(15, passageiro.getInstanteCriacao());
    }

    @Test
    void criarPassageiroAleatorioNuncaTemOrigemIgualAoDestino() {
        // Repete varias vezes para reduzir a probabilidade de um falso positivo
        // devido a aleatoriedade (o metodo evita explicitamente origem == destino).
        for (int i = 0; i < 100; i++) {
            Passageiro passageiro = factory.criarPassageiroAleatorio(5, 0);
            assertNotEquals(passageiro.getPisoOrigem(), passageiro.getPisoDestino());
        }
    }

    @Test
    void criarPassageiroAleatorioRespeitaOsLimitesDoPredio() {
        int numeroPisos = 4;

        for (int i = 0; i < 100; i++) {
            Passageiro passageiro = factory.criarPassageiroAleatorio(numeroPisos, 0);

            assertTrue(passageiro.getPisoOrigem() >= 0 && passageiro.getPisoOrigem() < numeroPisos);
            assertTrue(passageiro.getPisoDestino() >= 0 && passageiro.getPisoDestino() < numeroPisos);
        }
    }
}

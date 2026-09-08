package pt.ests.pa.model.passageiros;

/**
 * Representa um passageiro do tipo Idoso.
 * De acordo com o enunciado, os idosos têm a prioridade de embarque
 * mais alta dos três tipos de passageiros (Idosos > Crianças > Adultos).
 */
public class Idoso extends Passageiro {

    private static final int PRIORIDADE = 3;

    public Idoso(int pisoOrigem, int pisoDestino, int instanteCriacao) {
        super(pisoOrigem, pisoDestino, PRIORIDADE, instanteCriacao);
    }
}

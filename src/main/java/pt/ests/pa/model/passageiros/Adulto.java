package pt.ests.pa.model.passageiros;

/**
 * Representa um passageiro do tipo Adulto.
 * De acordo com o enunciado, os adultos têm a prioridade de embarque
 * mais baixa dos três tipos de passageiros (Idosos > Crianças > Adultos).
 */
public class Adulto extends Passageiro {

    private static final int PRIORIDADE = 1;

    public Adulto(int pisoOrigem, int pisoDestino, int instanteCriacao) {
        super(pisoOrigem, pisoDestino, PRIORIDADE, instanteCriacao);
    }
}

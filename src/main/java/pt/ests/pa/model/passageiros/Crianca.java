package pt.ests.pa.model.passageiros;

/**
 * Representa um passageiro do tipo Criança.
 * De acordo com o enunciado, as crianças têm prioridade de embarque
 * superior à dos adultos, mas inferior à dos idosos.
 */
public class Crianca extends Passageiro {

    private static final int PRIORIDADE = 2;

    public Crianca(int pisoOrigem, int pisoDestino, int instanteCriacao) {
        super(pisoOrigem, pisoDestino, PRIORIDADE, instanteCriacao);
    }
}

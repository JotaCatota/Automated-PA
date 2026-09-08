package pt.ests.pa.model.passageiros;

/**
 * Classe abstrata que representa um passageiro do simulador de elevadores.
 * Cada passageiro surge num piso de origem e pretende chegar a um piso de destino.
 */
public abstract class Passageiro {

    private int id;
    private int pisoOrigem;
    private int pisoDestino;
    private int prioridade;
    private int instanteCriacao;

    /**
     * Cria um novo passageiro.
     *
     * @param pisoOrigem      piso onde o passageiro surge
     * @param pisoDestino     piso para onde o passageiro se quer deslocar
     * @param prioridade      prioridade de embarque do passageiro (quanto maior, mais prioritário)
     * @param instanteCriacao instante t da simulação em que o passageiro foi criado
     */
    public Passageiro(int pisoOrigem, int pisoDestino, int prioridade, int instanteCriacao) {
        this.pisoOrigem = pisoOrigem;
        this.pisoDestino = pisoDestino;
        this.prioridade = prioridade;
        this.instanteCriacao = instanteCriacao;
    }
}

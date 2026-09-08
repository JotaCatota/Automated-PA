package pt.ests.pa.model.passageiros;

/**
 * Classe abstrata que representa um passageiro do simulador de elevadores.
 * Cada passageiro surge num piso de origem e pretende chegar a um piso de destino.
 */
public abstract class Passageiro {

    // Contador estático usado para atribuir um id único e sequencial a cada passageiro criado.
    private static int proximoId = 1;

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
        this.id = proximoId++;
        this.pisoOrigem = pisoOrigem;
        this.pisoDestino = pisoDestino;
        this.prioridade = prioridade;
        this.instanteCriacao = instanteCriacao;
    }

    /**
     * Devolve o identificador único do passageiro.
     *
     * @return o id do passageiro
     */
    public int getId() {
        return id;
    }

    /**
     * Devolve o piso onde o passageiro surgiu.
     *
     * @return o piso de origem
     */
    public int getPisoOrigem() {
        return pisoOrigem;
    }

    /**
     * Devolve o piso para onde o passageiro se pretende deslocar.
     *
     * @return o piso de destino
     */
    public int getPisoDestino() {
        return pisoDestino;
    }

    /**
     * Devolve a prioridade de embarque do passageiro.
     *
     * @return a prioridade (quanto maior, mais prioritário no embarque)
     */
    public int getPrioridade() {
        return prioridade;
    }

    /**
     * Devolve o instante t da simulação em que o passageiro foi criado.
     *
     * @return o instante de criação
     */
    public int getInstanteCriacao() {
        return instanteCriacao;
    }
}

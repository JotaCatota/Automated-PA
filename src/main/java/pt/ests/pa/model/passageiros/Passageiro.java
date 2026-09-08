package pt.ests.pa.model.passageiros;

import java.util.Objects;

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

    /**
     * Devolve uma representação textual do passageiro, incluindo o seu tipo
     * concreto (Crianca, Adulto ou Idoso), útil para a visualização em consola.
     * O tipo é obtido dinamicamente via {@code getClass()}, para que esta
     * implementação sirva todas as subclasses sem precisar de ser repetida.
     *
     * @return uma descrição textual do passageiro
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [id=" + id
                + ", origem=" + pisoOrigem
                + ", destino=" + pisoDestino
                + ", prioridade=" + prioridade + "]";
    }

    /**
     * Dois passageiros são considerados iguais se tiverem o mesmo id.
     * Como o id é único e gerado sequencialmente para todas as subclasses
     * (o contador é partilhado na classe base), não há risco de colisão
     * entre passageiros de tipos diferentes.
     *
     * @param obj o objeto a comparar
     * @return {@code true} se {@code obj} for um Passageiro com o mesmo id
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Passageiro)) {
            return false;
        }
        Passageiro outro = (Passageiro) obj;
        return this.id == outro.id;
    }

    /**
     * Calcula o hashCode do passageiro com base no seu id único,
     * consistente com a implementação de {@link #equals(Object)}.
     *
     * @return o hashCode do passageiro
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

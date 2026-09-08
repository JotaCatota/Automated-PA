package pt.ests.pa.model.edificio;

import pt.ests.pa.model.passageiros.Passageiro;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Representa um piso do edifício.
 * Cada piso tem um botão de chamada comum a todos os elevadores e mantém
 * a fila de passageiros que aguardam transporte a partir desse piso.
 */
public class Piso {

    private int numero;
    private Queue<Passageiro> filaEspera;

    /**
     * Cria um novo piso.
     *
     * @param numero o número identificador do piso
     */
    public Piso(int numero) {
        this.numero = numero;
        this.filaEspera = new PriorityQueue<>();
    }

    /**
     * Adiciona um passageiro à fila de espera deste piso.
     * A posição do passageiro na fila é determinada automaticamente pela
     * sua prioridade de embarque (ver {@link Passageiro#compareTo}).
     *
     * @param passageiro o passageiro a colocar em espera neste piso
     */
    public void adicionarPassageiro(Passageiro passageiro) {
        filaEspera.add(passageiro);
    }

    /**
     * Remove e devolve o próximo passageiro a embarcar, respeitando a
     * ordem de prioridade da fila de espera.
     *
     * @return o próximo passageiro a embarcar, ou {@code null} se não
     *         houver nenhum passageiro à espera neste piso
     */
    public Passageiro removerProximoPassageiro() {
        return filaEspera.poll();
    }

    /**
     * Devolve o número identificador deste piso.
     *
     * @return o número do piso
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Indica se existem passageiros à espera neste piso.
     *
     * @return {@code true} se houver pelo menos um passageiro em espera
     */
    public boolean temPassageirosEmEspera() {
        return !filaEspera.isEmpty();
    }

    /**
     * Devolve o número de passageiros atualmente à espera neste piso.
     *
     * @return o número de passageiros em espera
     */
    public int getNumeroPassageirosEmEspera() {
        return filaEspera.size();
    }
}

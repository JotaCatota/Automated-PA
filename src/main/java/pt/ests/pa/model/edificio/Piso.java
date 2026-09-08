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
}

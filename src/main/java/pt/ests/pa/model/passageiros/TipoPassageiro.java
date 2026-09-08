package pt.ests.pa.model.passageiros;

/**
 * Enumera os tipos de passageiro suportados pelo simulador.
 * Usado pela {@link PassageiroFactory} para decidir que subclasse de
 * {@link Passageiro} instanciar.
 */
public enum TipoPassageiro {
    CRIANCA,
    ADULTO,
    IDOSO
}

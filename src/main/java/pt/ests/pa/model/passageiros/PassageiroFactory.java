package pt.ests.pa.model.passageiros;

/**
 * Fábrica responsável pela criação de passageiros.
 * Implementa o padrão de desenho criacional Factory Method, centralizando
 * a decisão de qual subclasse concreta de {@link Passageiro} instanciar,
 * conforme exigido no enunciado do projeto.
 */
public class PassageiroFactory {

    /**
     * Cria um passageiro do tipo indicado.
     *
     * @param tipo            o tipo de passageiro a criar
     * @param pisoOrigem      piso onde o passageiro surge
     * @param pisoDestino     piso para onde o passageiro se quer deslocar
     * @param instanteCriacao instante t da simulação em que o passageiro é criado
     * @return uma nova instância da subclasse de Passageiro correspondente ao tipo
     */
    public Passageiro criarPassageiro(TipoPassageiro tipo, int pisoOrigem, int pisoDestino, int instanteCriacao) {
        switch (tipo) {
            case CRIANCA:
                return new Crianca(pisoOrigem, pisoDestino, instanteCriacao);
            case IDOSO:
                return new Idoso(pisoOrigem, pisoDestino, instanteCriacao);
            default:
                return new Adulto(pisoOrigem, pisoDestino, instanteCriacao);
        }
    }
}

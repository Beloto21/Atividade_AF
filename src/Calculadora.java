
/**
 * <p><strong>Projeto Calculadora</strong></p>
 *
 * <p>Esta classe representa uma calculadora simples, criada para demonstrar
 * conceitos de revisão de código, boas práticas de programação e documentação.
 * Ela reúne as operações matemáticas básicas — soma, subtração, multiplicação
 * e divisão — de forma clara e direta.</p>
 *
 * <p>A ideia principal aqui é manter os métodos o mais simples possível.
 * Cada operação é feita isoladamente, sem efeitos colaterais, o que facilita
 * bastante na hora de testar e entender o comportamento de cada função.</p>
 *
 * <p>Além disso, o método {@code calcular} centraliza as operações, escolhendo
 * automaticamente o que fazer com base no operador informado pelo usuário.
 * Caso o operador não seja reconhecido, uma exceção é lançada, garantindo que
 * o programa não faça nada inesperado.</p>
 *
 * <p>Este código também foi documentado com Javadoc para servir como exemplo
 * de como escrever comentários úteis e organizados em projetos Java.</p>
 * 
 * @author Nicolas Beloto Armenio
 * @version 1.0
 */
public class Calculadora {

    /**
     * Realiza a soma entre dois números inteiros.
     *
     * @param a primeiro número da operação
     * @param b segundo número da operação
     * @return o resultado da soma de {@code a} com {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração entre dois números inteiros.
     *
     * <p>A operação é feita da forma tradicional: {@code a - b}.</p>
     *
     * @param a número inicial
     * @param b valor a ser subtraído
     * @return o resultado de {@code a - b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Calcula o produto entre dois números inteiros.
     *
     * <p>Esta função simplesmente multiplica os dois valores recebidos
     * como parâmetros.</p>
     *
     * @param a primeiro fator
     * @param b segundo fator
     * @return o resultado da multiplicação de {@code a} por {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão entre dois números inteiros.
     *
     * <p>Antes de executar a operação, o método verifica se o divisor é zero.
     * Caso seja, uma exceção é lançada para evitar erros de execução.</p>
     *
     * @param a dividendo
     * @param b divisor
     * @return o resultado da divisão de {@code a} por {@code b}
     *
     * @throws IllegalArgumentException se {@code b} for igual a zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * Escolhe e executa a operação matemática correta com base no operador
     * recebido como parâmetro.
     *
     * <p>Operadores aceitos:</p>
     * <ul>
     *     <li>"+" → Soma</li>
     *     <li>"-" → Subtração</li>
     *     <li>"*" → Multiplicação</li>
     *     <li>"/" → Divisão</li>
     * </ul>
     *
     * <p>Se qualquer outro valor for informado, uma exceção é lançada para
     * indicar que o operador não existe.</p>
     *
     * @param a primeiro número da operação
     * @param b segundo número da operação
     * @param operador símbolo da operação desejada
     * @return o resultado da operação correspondente
     *
     * @throws IllegalArgumentException se o operador informado não for válido
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}


/**
 * <p><strong>Classe de Testes da Calculadora</strong></p>
 *
 * <p>Esta classe foi criada para demonstrar, de forma simples e prática,
 * como a classe {@link Calculadora} funciona na execução das operações
 * matemáticas básicas.</p>
 *
 * <p>Aqui são realizados alguns testes diretos, chamando o método
 * {@code calcular} com diferentes operadores e valores. Além disso,
 * também são feitos testes que verificam se as exceções estão sendo
 * lançadas corretamente — como no caso de divisão por zero ou quando
 * um operador inválido é informado.</p>
 *
 * <p>Este arquivo serve tanto como um exemplo de uso da calculadora quanto
 * como uma forma rápida de validar o comportamento dos métodos implementados.</p>
 *
 * <p><strong>Obs.:</strong> Este é um teste simples, sem frameworks, pensado
 * apenas para fins didáticos.</p>
 * 
 * @author Nicolas Beloto Armenio
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Método principal responsável por executar os testes da classe Calculadora.
     *
     * <p>Aqui são exibidos no console os resultados de operações válidas e,
     * logo em seguida, são provocadas situações que geram exceção, para
     * demonstrar como o programa reage a entradas incorretas.</p>
     *
     * @param args argumentos de linha de comando (não utilizados neste exemplo)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Testes com operadores válidos
        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        // Teste de exceção: divisão por zero
        try {
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Teste de exceção: operador inválido
        try {
            System.out.println(calc.calcular(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

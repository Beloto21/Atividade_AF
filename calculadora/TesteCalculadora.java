package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Testes rápidos
        calc.calc(  2,  3,  "+"); // esperado: 5
        calc.calc(  8,  3,  "-"); // esperado: 5
        calc.calc(  2,  3,  "*"); // esperado: 6
        calc.calc(  8,  2,  "/"); // esperado: 4
        calc.calc(  8,  0,  "/"); // divisao por zero
        calc.calc(  5,  5,  "x"); // operação inválida
    }
}
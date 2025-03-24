public class Operadores {

    public static void main(String[] args) {
        int a, b;
        a = 6;
        b = 2;

        int multiplicacao = a * b;
        System.out.println(multiplicacao);


        int soma = a + b;
        System.out.println(soma);

        int divisao = a / b;
        System.out.println(divisao);

        int subtracao = a - b;
        System.out.println(subtracao);

        //resto da divisao
        int modulo = a % b;
        System.out.println(modulo);


        //Operadores de incremento e decremento

        /*
        Quando o operador é delcarado antes da variável, o incremento é realizado antes do valor da variável ser lido
        para o processamento ao qual a instrução pertence.
         */

        int incremento = ++a;
        System.out.println("incremento antes da variável " + incremento);

        int decremento = --a;
        System.out.println("decremento antes da variável " + decremento);

        /*
        Quando é declarado após, lê-se o valor da variável para processamento e só então o valor da variável
        é incrementado.
         */

        int c = 8;
        int d = 8;

        int incremento1 = c++;
        System.out.println(incremento1);

        int decremento1 = d--;
        System.out.println(decremento1);


        int resultador = a == b ? 1 : 0;
        System.out.println(resultador);

    }
}

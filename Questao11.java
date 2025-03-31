public class Questao11 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int aux = 0;

        aux = a;
        a = b;
        b = aux;

        if (a == 2 && b == 1) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        // Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a
        //possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.

    }
}

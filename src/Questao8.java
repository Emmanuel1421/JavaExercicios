import java.util.Scanner;
public class Questao8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double raio,altura,volume;
        double pi = 3.14;

        System.out.println("Insira o valor do raio: ");
        raio = scn.nextDouble();

        System.out.println("Insira o valor da altura: ");
        altura = scn.nextDouble();

        volume = pi * raio * raio * altura;

        System.out.println("O valor do volume é de: "+volume);

    }
}

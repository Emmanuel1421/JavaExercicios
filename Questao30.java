import java.util.Scanner;

public class Questao30 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num,i;

        System.out.println("Digite um número: ");
        num = scn.nextInt();

        for (i = 1; i <= 10; i++){
            int resultado = num * i;

            System.out.println(resultado);
        }

    }
}

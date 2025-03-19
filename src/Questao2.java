import java.util.Scanner;

public class Questao2 {

    /*Faça um programa que:
    - Leia a cotação do dólar
    - Leia um valor em dólares
    - Converta esse valor para Real
    - Mostre o resultado*/

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double dolCotado,real,dol;
         dolCotado = 5.67;

        System.out.println("A cotação do dolar é de: "+dolCotado);

        System.out.println("Digite o valor do Dolar:");
        dol = scn.nextDouble();


        real = dol * dolCotado;

        System.out.println("Você tem "+dol+", o valor convertido para reais é de: "+real);





    }

}

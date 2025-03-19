import java.util.Scanner;
public class Questao9 {
    public static void main(String[] args) {
        int ano = 365;
        int mes = 30;
        int dias,anoUsuario,mesUsuario,anoEmDias,mesEmDias,total;



        Scanner scn = new Scanner(System.in);

        System.out.println("Digite quantos anos você tem: ");
        anoUsuario = scn.nextInt();

        System.out.println("Digite quantos meses: ");
        mesUsuario = scn.nextInt();

        System.out.println("Digite os dias: ");
        dias = scn.nextInt();

        anoEmDias = anoUsuario * ano;
        mesEmDias = mesUsuario * mes;
        total = anoEmDias + mesEmDias + dias;

        System.out.println("Uau!! Você tem: "+total+" dias ");
    }
}

import java.util.Scanner;
public class Questao5 {

    public static void main(String[] args) {
        int kmL;
        double tempo,veloMed,distancia,ltGasto;


        Scanner scn = new Scanner (System.in);

        System.out.println("Digite a velocidade média do veículo durante a viagem: ");
        veloMed = scn.nextDouble();

        System.out.println("Digite o tempo(em horas) gasto na viagem: ");
        tempo = scn.nextDouble();

        distancia  = tempo * veloMed;

        System.out.println("A distância percorrida durante a viagem foi de: "+distancia+"KM");

        ltGasto = distancia / 12;

        System.out.println("A quantidade de gasolina utilizada foi de: "+ltGasto+"L");


    }

}

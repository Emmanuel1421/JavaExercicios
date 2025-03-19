import java.util.Scanner;

public class Questao4 {
    /*Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os valores
    lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis A, B, C e
    D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B com D e por
    último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo, devem ser
    realizadas doze operações de processamento, sendo seis para as adições e seis para as multiplicações*/

    public static void main(String[] args) {
        int a,b,c,d;
        int v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12;

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        a = scn.nextInt();
        System.out.println("Digite o segundo valor:");
        b = scn.nextInt();
        System.out.println("Digite o terceiro valor:");
        c = scn.nextInt();
        System.out.println("Digite o quarto valor:");
        d = scn.nextInt();


        v1=a+b;
        v2=a+c;
        v3=a+d;
        v4=b+c;
        v5=b+d;
        v6=c+d;

        System.out.println("O resultado da soma 1 é: "+v1);
        System.out.println("O resultado da soma 2 é: "+v2);
        System.out.println("O resultado da soma 3 é: "+v3);
        System.out.println("O resultado da soma 4 é: "+v4);
        System.out.println("O resultado da soma 5 é: "+v5);
        System.out.println("O resultado da soma 6 é: "+v6);

        v7=(v1*a)+(v1 *b);
        v8=(v2*a)+(v2 *c);
        v9=(v3*a)+(v3 *d);
        v10=(v4*b)+(v4 *c);
        v11=(v5*b)+(v5 *d);
        v12=(v6*c)+(v6 *d);

        System.out.println("O resultado da multiplicação 1 é: "+v7);
        System.out.println("O resultado da multiplicação 2 é: "+v8);
        System.out.println("O resultado da multiplicação 3 é: "+v9);
        System.out.println("O resultado da multiplicação 4 é: "+v10);
        System.out.println("O resultado da multiplicação 5 é: "+v11);
        System.out.println("O resultado da multiplicação 6 é: "+v12);

    }



}

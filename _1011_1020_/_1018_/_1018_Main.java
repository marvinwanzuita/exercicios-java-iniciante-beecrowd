package beecrowd.iniciante._1011_1020_._1018_;

import java.util.Scanner;

public class _1018_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valorTotal = sc.nextInt();

        int notas100 = valorTotal / 100;
        int restante = valorTotal - (notas100 * 100);

        int notas50 = restante / 50;
        restante = restante - (notas50 * 50);

        int notas20 = restante / 20;
        restante = restante - (notas20 * 20);

        int notas10 = restante / 10;
        restante = restante - (notas10 * 10);

        int notas5 = restante / 5;
        restante = restante - (notas5 * 5);

        int notas2 = restante / 2;
        restante = restante - (notas2 * 2);

        int notas1 = restante / 1;

        System.out.println(valorTotal);
        System.out.println(notas100 + " notas(s) de R$ 100,00");
        System.out.println(notas50 + " notas(s) de R$ 50,00");
        System.out.println(notas20 + " notas(s) de R$ 20,00");
        System.out.println(notas10 + " notas(s) de R$ 10,00");
        System.out.println(notas5 + " notas(s) de R$ 5,00");
        System.out.println(notas2 + " notas(s) de R$ 2,00");
        System.out.println(notas1 + " notas(s) de R$ 1,00");

    }

}

package beecrowd.iniciante._1021_1050_._1021_;

import java.util.Scanner;

public class _1021_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorTotal = sc.nextDouble();

        int valorTotalInteiro = (int) valorTotal;

        int notas100 = valorTotalInteiro / 100;
        int restante = valorTotalInteiro - (notas100 * 100);

        int notas50 = restante / 50;
        restante -= (notas50 * 50);

        int notas20 = restante / 20;
        restante -= (notas20 * 20);

        int notas10 = restante / 10;
        restante -= (notas10 * 10);

        int notas5 = restante / 5;
        restante -= (notas5 * 5);

        int notas2 = restante / 2;
        restante -= (notas2 * 2);

        int moedas1 = restante / 1;

        double moedasRestantes = (valorTotal - valorTotalInteiro);

        int moedas50 = (int) (moedasRestantes / 0.5);
        moedasRestantes -= (moedas50 * 0.50);

        int moedas25 = (int) (moedasRestantes / 0.25);
        moedasRestantes -= (moedas25 * 0.25);

        int moedas10 = (int) (moedasRestantes / 0.10);
        moedasRestantes -= (moedas10 * 0.10);

        int moedas5 = (int) (moedasRestantes / 0.05);
        moedasRestantes -= (moedas5 * 0.05);

        double moedas01 = moedasRestantes % 0.05;
        moedas01 = moedas01 * 100;

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");
        System.out.println(moedas5 + " moeda(s) de R$ 0.05");
        System.out.println(String.format("%.0f", moedas01) + " moeda(s) de R$ 0.01");

    }
}

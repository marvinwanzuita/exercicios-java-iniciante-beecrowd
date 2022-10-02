package beecrowd.iniciante._1017_;

import java.util.Scanner;

public class _1017_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double MEDIA_LITROS_AUTOMOVEL = 12.0;
        int tempoViagem = sc.nextInt();
        int velocidadeMedia = sc.nextInt();

        double litrosNecessarios = (tempoViagem * velocidadeMedia) / MEDIA_LITROS_AUTOMOVEL;

        System.out.println(String.format("%.3f", litrosNecessarios));

    }
}

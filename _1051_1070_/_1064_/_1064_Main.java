package beecrowd.iniciante._1051_1070_._1064_;

import java.util.Scanner;

public class _1064_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numeroDigitado;
        int numerosPositivos = 0;

        double total = 0;
        double media = 0;

        for (int i = 0; i < 6; i++) {
            numeroDigitado = sc.nextDouble();
            if (numeroDigitado > 0){
                numerosPositivos++;
                total += numeroDigitado;
            }
        }

        media = total / numerosPositivos;

        System.out.println(numerosPositivos + " valores positivos");
        System.out.printf("%.1f%n", media);

        sc.close();

    }

}

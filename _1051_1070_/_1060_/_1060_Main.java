package beecrowd.iniciante._1051_1070_._1060_;

import java.util.Scanner;

public class _1060_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numeroDigitado;
        int numerosPositivos = 0;

        for (int i = 0; i < 6; i++) {
            numeroDigitado = sc.nextDouble();
            if (numeroDigitado > 0){
                numerosPositivos++;
            }
        }

        System.out.println(numerosPositivos + " valores positivos");

        sc.close();
    }
}

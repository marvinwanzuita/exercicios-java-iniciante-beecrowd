package beecrowd.iniciante._1051_1070_._1070_;

import java.util.Scanner;

public class _1070_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroDigitado = sc.nextInt();

        for (int i = numeroDigitado; i < (numeroDigitado + 12); i++) {

            if ((i % 2) != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}

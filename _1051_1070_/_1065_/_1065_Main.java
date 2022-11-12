package beecrowd.iniciante._1051_1070_._1065_;

import java.util.Scanner;

public class _1065_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroDigitado;
        int numerosPares = 0;

        for (int i = 0; i < 5; i++) {
            numeroDigitado = sc.nextInt();
            if ((numeroDigitado % 2) == 0){
                numerosPares++;
            }
        }

        System.out.println(numerosPares + " valores pares");

    }
}

package beecrowd.iniciante._1051_1070_._1066_;

import java.util.Scanner;

public class _1066_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroDigitado;

        int numerosPares = 0;
        int numerosImpares = 0;
        int numerosPositivos = 0;
        int numerosNegativos = 0;

        for (int i = 0; i < 5; i++) {
            numeroDigitado = sc.nextInt();

            if ((numeroDigitado % 2) == 0){
                numerosPares++;
            } else {
                numerosImpares++;
            }

            if (numeroDigitado > 0){
                numerosPositivos++;
            } else if (numeroDigitado < 0){
                numerosNegativos++;
            }
        }

        System.out.println(numerosPares + " valor(es) par(es)");
        System.out.println(numerosImpares + " valor(es) impar(es)");
        System.out.println(numerosPositivos + " valor(es) positivo(s)");
        System.out.println(numerosNegativos + " valor(es) negativo(s)");

        sc.close();
    }
}

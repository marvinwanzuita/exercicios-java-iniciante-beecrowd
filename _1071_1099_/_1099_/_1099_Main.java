package beecrowd.iniciante._1071_1099_._1099_;

import java.util.Scanner;

public class _1099_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casosTeste = sc.nextInt();
        sc.nextLine();

        String valoresInteiros;
        String[] valoresInteirosSeparados;

        int n1;
        int n2;
        int aux;

        int[] totalSomaImpares = new int[casosTeste];

        for (int i = 0; i < casosTeste; i++) {

            valoresInteiros = sc.nextLine();
            valoresInteirosSeparados = valoresInteiros.split(" ");

            n1 = Integer.parseInt(valoresInteirosSeparados[0]);
            n2 = Integer.parseInt(valoresInteirosSeparados[1]);

            if (n1 > n2) {
                aux = n1;
                n1 = n2;
                n2 = aux;
            }

            totalSomaImpares[i] = 0;

            for (int j = n1 + 1; j < n2 ; j++) {

                if ((j % 2) != 0){
                    totalSomaImpares[i] += j;
                }
            }
        }

        for (int i: totalSomaImpares) {
            System.out.println(i);
        }


    }

}

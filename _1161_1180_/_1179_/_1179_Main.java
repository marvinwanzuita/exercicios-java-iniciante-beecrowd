package beecrowd.iniciante._1161_1180_._1179_;

import java.util.Scanner;

public class _1179_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N;

        int[] pares = new int[5];
        int posicaoPar = 0;

        int[] impares = new int[5];
        int posicaoImpar = 0;

        for (int i = 0; i < 15; i++) {

            N = sc.nextInt();

            if (N % 2 == 0){
                pares[posicaoPar] = N;
                posicaoPar++;
            } else {
                impares[posicaoImpar] = N;
                posicaoImpar++;
            }

            if (posicaoImpar == 5 || i == 14){
                for (int j = 0; j < posicaoImpar; j++) {
                    System.out.println("impar[" + j + "] = " + impares[j]);
                }
                posicaoImpar = 0;
            }

            if (posicaoPar == 5 || i == 14){
                for (int j = 0; j < posicaoPar; j++) {
                    System.out.println("par[" + j + "] = " + pares[j]);
                }
                posicaoPar = 0;
            }

        }

        sc.close();
    }
}

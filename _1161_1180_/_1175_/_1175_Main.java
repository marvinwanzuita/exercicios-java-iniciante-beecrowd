package beecrowd.iniciante._1161_1180_._1175_;

import java.util.Scanner;

public class _1175_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int TAMANHO_ARRAY = 20;
        int[] N = new int[TAMANHO_ARRAY];
        int[] Ninvertido = new int[TAMANHO_ARRAY];

        for (int i = 0; i < N.length; i++) {
            N[i] = sc.nextInt();
        }

        int contador = TAMANHO_ARRAY - 1;
        for (int i = 0; i < N.length; i++) {
            Ninvertido[i] = N[contador];
            System.out.println("N[" + i + "] = " + Ninvertido[i]);
            contador--;
        }

        sc.close();


    }
}

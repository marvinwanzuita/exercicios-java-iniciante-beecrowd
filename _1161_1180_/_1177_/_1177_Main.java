package beecrowd.iniciante._1161_1180_._1177_;

import java.util.Scanner;

public class _1177_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] N = new int[1000];
        int contador = 0;

        for (int i = 0; i < N.length; i++) {

            N[i] = contador;
            System.out.println("N["+ i + "] = " + N[i]);
            contador++;

            if (contador >= T){
                contador = 0;
            }

        }

        sc.close();
    }
}

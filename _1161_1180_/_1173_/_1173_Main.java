package beecrowd.iniciante._1161_1180_._1173_;

import java.util.Scanner;

public class _1173_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int[] N = new int[10];

        for (int i = 0; i < N.length; i++) {

            if (i == 0) {
                N[i] = X;
                System.out.println("N[" + i + "] = " + N[i]);
            } else {
                N[i] = N[i - 1] * 2;
                System.out.println("N[" + i + "] = " + N[i]);
            }

        }

        sc.close();


    }
}

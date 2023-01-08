package beecrowd.iniciante._1161_1180_._1172_;

import java.util.Scanner;

public class _1172_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] X = new int[10];

        for (int i = 0; i < X.length; i++) {
            X[i] = sc.nextInt();
            if (X[i] <= 0){
                X[i] = 1;
                System.out.println("X[" + i + "] = " + X[i]);
            } else {
                System.out.println("X[" + i + "] = " + X[i]);
            }
        }

        sc.close();

    }
}

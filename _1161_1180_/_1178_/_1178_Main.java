package beecrowd.iniciante._1161_1180_._1178_;

import java.util.Scanner;

public class _1178_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double X = sc.nextDouble();
        double[] N = new double[100];

        for (int i = 0; i < N.length; i++) {

            if (i == 0){
                N[i] = X;
            } else {
                N[i] = N[i - 1] / 2;
            }
            System.out.println("N[" + i + "] = " + String.format("%.4f", N[i]));
        }

        sc.close();

    }
}

package beecrowd.iniciante._1161_1180_._1174_;

import java.util.Scanner;

public class _1174_Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double[] A = new double[100];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextDouble();
        }

        int contagem = 0;
        for (double d : A) {
            if (d <= 10) {
                System.out.println("A[" + contagem + "] = " + String.format("%.1f", d));
            }
            contagem++;
        }

        sc.close();


    }
}

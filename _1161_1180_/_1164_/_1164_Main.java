package beecrowd.iniciante._1161_1180_._1164_;

import java.util.Scanner;

public class _1164_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X;
        int total;

        for (int i = 0; i < N; i++) {

            total = 0;
            X = sc.nextInt();

            for (int j = 1; j < X; j++) {

                if (X % j == 0){
                    total += j;
                }

            }

            if (total == X){
                System.out.println(X + " eh perfeito");
            } else {
                System.out.println(X + " nao eh perfeito");
            }

        }

        sc.close();
    }
}

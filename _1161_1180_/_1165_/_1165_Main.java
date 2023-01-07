package beecrowd.iniciante._1161_1180_._1165_;

import java.util.Scanner;

public class _1165_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X;
        int divisores;

        for (int i = 0; i < N; i++) {

            divisores = 0;
            X = sc.nextInt();

            for (int j = 1; j <= X; j++) {

                if (X % j == 0){
                    divisores++;
                }
            }

            if (divisores > 2){
                System.out.println(X + " nao eh primo");
            } else {
                System.out.println(X + " eh primo");
            }
        }

        sc.close();
    }
}

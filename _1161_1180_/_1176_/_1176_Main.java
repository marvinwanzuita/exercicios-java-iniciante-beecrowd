package beecrowd.iniciante._1161_1180_._1176_;

import java.util.Scanner;

public class _1176_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int N;


        for (int i = 0; i < T; i++) {

            N = sc.nextInt();

            if (N == 0){

                int[] fibonacci = new int[1];
                fibonacci[0] = 0;
                System.out.println("Fib(" + 0 + ") = " + 0 );

            } else if (N == 1) {

                int[] fibonacci = new int[1];
                fibonacci[0] = 1;
                System.out.println("Fib(" + 1 + ") = " + 1 );

            } else {

                long[] fibonacci = new long[N];

                for (int j = 0; j < fibonacci.length; j++) {

                    if (j == 0) {
                        fibonacci[j] = 1;
                    } else if (j == 1) {
                        fibonacci[j] = 1;
                    } else {
                        fibonacci[j] = fibonacci[j - 2] + fibonacci[j - 1];
                    }
                }

                System.out.println("Fib(" + N + ") = " + fibonacci[N - 1] );
            }


        }

        sc.close();
    }
}

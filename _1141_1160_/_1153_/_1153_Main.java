package beecrowd.iniciante._1141_1160_._1153_;

import java.util.Scanner;

public class _1153_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = N; i > 1; i--) {
            N *= (i - 1);
        }

        System.out.println(N);
        sc.close();
    }
}

package beecrowd.iniciante._1141_1160_._1151_;

import java.util.Scanner;

public class _1151_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] fibonacci = new int[N];
        String fibonacciString = "";

        for (int i = 0; i < N; i++) {

            if (i == 0){
                fibonacci[i] = 0;
            } else if (i == 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }

        for (int n : fibonacci) {
            fibonacciString += Integer.toString(n) + " ";
        }

        fibonacciString = fibonacciString.substring(0, fibonacciString.length() - 1);

        System.out.println(fibonacciString);

    }
}

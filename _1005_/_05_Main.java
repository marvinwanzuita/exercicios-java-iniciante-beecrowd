package beecrowd.iniciante._1005_;

import java.util.Scanner;

public class _05_Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Double n1 = sc.nextDouble();
        Double n2 = sc.nextDouble();

        Double media = ((n1 * 3.5) + (n2 * 7.5)) / (3.5 + 7.5) ;

        System.out.println("MEDIA = " + String.format("%.5f", media));

    }
}

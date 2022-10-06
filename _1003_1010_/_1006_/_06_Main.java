package beecrowd.iniciante._1003_1010_._1006_;

import java.util.Scanner;

public class _06_Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Double A = sc.nextDouble();
        Double B = sc.nextDouble();
        Double C = sc.nextDouble();

        Double MEDIA = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5);

        System.out.println("MEDIA = " + String.format("%.1f", MEDIA));

    }
}

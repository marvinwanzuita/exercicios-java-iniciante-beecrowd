package beecrowd.iniciante._1011_;


import java.util.Scanner;

public class _1011_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;
        double radius = sc.nextDouble();

        double sphereVolume = (4.0 / 3.0) * PI * (radius * radius * radius);

        System.out.println("VOLUME = " + String.format("%.3f", sphereVolume));

    }

}

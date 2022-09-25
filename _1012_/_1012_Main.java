package beecrowd.iniciante._1012_;

import java.util.Scanner;

public class _1012_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;

        String measurements = sc.nextLine();

        String[] measurementsList = measurements.split(" ");

        Double sideA = Double.valueOf(measurementsList[0]).doubleValue();
        Double sideB = Double.valueOf(measurementsList[1]).doubleValue();
        Double sideC = Double.valueOf(measurementsList[2]).doubleValue();

        Double triangle = (sideA * sideC) / 2;
        Double circle = PI * (sideC * sideC);
        Double trapeze = ((sideA + sideB) * sideC) / 2;
        Double square = sideB * sideB;
        Double rectangle = sideA * sideB;


        System.out.println("TRIANGULO: " + String.format("%.3f", triangle));
        System.out.println("CIRCULO: " + String.format("%.3f", circle));
        System.out.println("TRAPEZIO: " + String.format("%.3f", trapeze));
        System.out.println("QUADRADO: " + String.format("%.3f", square));
        System.out.println("RETANGULO: " + String.format("%.3f", rectangle));

    }
}

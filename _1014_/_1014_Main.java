package beecrowd.iniciante._1014_;

import java.util.Scanner;

public class _1014_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int distanciaTotal = sc.nextInt();
        double combustivelGasto = sc.nextDouble();

        double consumoMedio = distanciaTotal / combustivelGasto;

        System.out.println(String.format("%.3f", consumoMedio) + " km/l");


    }
}

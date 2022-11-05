package beecrowd.iniciante._1021_1050_._1043_;

import java.util.Scanner;

public class _1043_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String medidas = sc.nextLine();

        String[] medidasSeparadas = medidas.split(" ");

        double A = Double.parseDouble(medidasSeparadas[0]);
        double B = Double.parseDouble(medidasSeparadas[1]);
        double C = Double.parseDouble(medidasSeparadas[2]);

        boolean condicaoA = ((B - C) < A) && (A < (B + C));
        boolean condicaoB = ((A - C) < B) && (B < (A + C));
        boolean condicaoC = ((A - B) < C) && (C < (A + B));

        double perimetro = A + B + C;
        double areaTrapezio = ((A + B) * C) / 2;


        if (condicaoA && condicaoB && condicaoC){
            System.out.println("Perimetro = " + String.format("%.1f", perimetro));
        } else {
            System.out.println("Area = " + String.format("%.1f", areaTrapezio));
        }

        sc.close();
    }
}

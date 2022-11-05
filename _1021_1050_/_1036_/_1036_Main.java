package beecrowd.iniciante._1021_1050_._1036_;

import java.util.Scanner;

public class _1036_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String numerosString = sc.nextLine();

        String[] numerosSeparados = numerosString.split(" ");

        Double A = Double.parseDouble(numerosSeparados[0]);
        Double B = Double.parseDouble(numerosSeparados[1]);
        Double C = Double.parseDouble(numerosSeparados[2]);

        Double delta = Math.pow(B, 2) - (4 * A * C);

        Double R1 = (- B + Math.sqrt(delta)) / (2 * A);
        Double R2 = (- B - Math.sqrt(delta)) / (2 * A);

        if (R1.isNaN() || R2.isNaN() || R1.isInfinite() || R2.isInfinite()){
            System.out.println("Impossivel calcular");
        } else {
            System.out.println("R1 = " + String.format("%.5f", R1));
            System.out.println("R2 = " + String.format("%.5f", R2));
        }


    }

}

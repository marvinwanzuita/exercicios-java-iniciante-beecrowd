package beecrowd.iniciante._1071_1099_._1079_;

import java.sql.Array;
import java.util.Scanner;

public class _1079_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casosTeste = sc.nextInt();
        sc.nextLine();

        String valoresDecimais;
        String[] valoresDecimaisSeparados;

        final int PESO_1 = 2;
        final int PESO_2 = 3;
        final int PESO_3 = 5;

        double valor1;
        double valor2;
        double valor3;

        double total[] = new double[casosTeste];

        for (int i = 0; i < casosTeste; i++) {

            valoresDecimais = sc.nextLine();
            valoresDecimaisSeparados = valoresDecimais.split(" ");

            valor1 = Double.parseDouble(valoresDecimaisSeparados[0]);
            valor2 = Double.parseDouble(valoresDecimaisSeparados[1]);
            valor3 = Double.parseDouble(valoresDecimaisSeparados[2]);

            total[i] = ((valor1 * PESO_1) + (valor2 *  PESO_2) + ( valor3 * PESO_3)) / (PESO_1 + PESO_2 + PESO_3);

        }

        for (double d : total) {
            System.out.println(String.format("%.1f", d));
        }

        sc.close();
    }
}

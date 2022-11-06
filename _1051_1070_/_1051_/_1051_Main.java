package beecrowd.iniciante._1051_1070_._1051_;

import java.util.Scanner;

public class _1051_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        double salario2000ate3000 = 0;
        double salario3000ate4500 = 0;
        double salarioAcima4500 = 0;

        final double IMPOSTO_2000_A_3000 = 8.0;
        final double IMPOSTO_3000_A_4500 = 18.0;
        final double IMPOSTO_ACIMA_4500 = 28.0;

        double impostoCalculado2000a3000 = (8.0 / 100) * 1000;
        double impostoCalculado3000a4500 = (18.0 / 100) * 1500;

        double impostoFinal = 0;

        if (salario > 4500){
            salarioAcima4500 = salario - 4500;
            impostoFinal = impostoCalculado2000a3000 + impostoCalculado3000a4500 + ((IMPOSTO_ACIMA_4500 / 100) * salarioAcima4500 );
            System.out.println("R$ " + String.format("%.2f",impostoFinal));
        } else if (salario > 3000) {
            salario3000ate4500 = salario - 3000;
            impostoFinal = impostoCalculado2000a3000 + ((IMPOSTO_3000_A_4500 / 100) * salario3000ate4500);
            System.out.println("R$ " + String.format("%.2f",impostoFinal));
        } else if (salario > 2000) {
            salario2000ate3000 = salario - 2000;
            impostoFinal = ((IMPOSTO_2000_A_3000 / 100) * salario2000ate3000);
            System.out.println("R$ " + String.format("%.2f",impostoFinal));
        } else {
            System.out.println("Isento");
        }

        sc.close();

    }
}

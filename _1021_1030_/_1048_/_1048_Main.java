package beecrowd.iniciante._1021_1030_._1048_;

import java.util.Scanner;

public class _1048_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        final int REAJUSTE_0_400 = 15;
        final int REAJUSTE_400_A_800 = 12;
        final int REAJUSTE_800_A_1200 = 10;
        final int REAJUSTE_1200_A_2000 = 7;
        final int REAJUSTE_ACIMA_2000 = 4;

        double valorReajuste = 0;
        double salarioReajustado = salario;
        int porcentualReajustado = 0;

        if (salario > 2000){
            valorReajuste = (REAJUSTE_ACIMA_2000 * salario) / 100;
            salarioReajustado += valorReajuste;
            porcentualReajustado = REAJUSTE_ACIMA_2000;
        } else if ((salario > 1200) && (salario <= 2000)) {
            valorReajuste = (REAJUSTE_1200_A_2000 * salario) / 100;
            salarioReajustado += valorReajuste;
            porcentualReajustado = REAJUSTE_1200_A_2000;
        } else if ((salario > 800) && (salario <= 1200)) {
            valorReajuste = (REAJUSTE_800_A_1200 * salario) / 100;
            salarioReajustado += valorReajuste;
            porcentualReajustado = REAJUSTE_800_A_1200;
        } else if ((salario > 400) && (salario <= 800)) {
            valorReajuste = (REAJUSTE_400_A_800 * salario) / 100;
            salarioReajustado += valorReajuste;
            porcentualReajustado = REAJUSTE_400_A_800;
        } else if ((salario >=0) && (salario <= 400)) {
            valorReajuste = (REAJUSTE_0_400 * salario) / 100;
            salarioReajustado += valorReajuste;
            porcentualReajustado = REAJUSTE_0_400;
        }

        System.out.println("Novo salario: " + String.format("%.2f", salarioReajustado));
        System.out.println("Reajuste ganho: " + String.format("%.2f", valorReajuste));
        System.out.println("Em percentual: " + porcentualReajustado + " %");


    }
}

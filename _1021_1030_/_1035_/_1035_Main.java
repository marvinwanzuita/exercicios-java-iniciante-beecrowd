package beecrowd.iniciante._1021_1030_._1035_;

import java.util.Scanner;

public class _1035_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String numerosString = sc.nextLine();

        String[] numerosSeparados = numerosString.split(" ");

        int A = Double.valueOf(numerosSeparados[0]).intValue();
        int B = Double.valueOf(numerosSeparados[1]).intValue();
        int C = Double.valueOf(numerosSeparados[2]).intValue();
        int D = Double.valueOf(numerosSeparados[3]).intValue();

        boolean BMaiorQueC = B > C;
        boolean DMaiorQueA = D > A;
        boolean somaCComDMaiorQueSomaAComB = (C + D) > (A + B);
        boolean CeDsaoPositivos = (C >= 0) && ( D >= 0);
        boolean AehPar = (A % 2) == 0;

        if (BMaiorQueC &&
            DMaiorQueA &&
            somaCComDMaiorQueSomaAComB &&
            CeDsaoPositivos &&
            AehPar) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        sc.close();
    }
}

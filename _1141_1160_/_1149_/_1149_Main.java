package beecrowd.iniciante._1141_1160_._1149_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1149_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String valores = sc.nextLine();
        String[] valoresSeparados = valores.split(" ");

        Integer[] valoresInteirosSeparados = new Integer[valoresSeparados.length];

        int A = 0;
        int i = 0;
        int index = 0;

        int somaTotal = 0;

        for (String s : valoresSeparados) {
            valoresInteirosSeparados[index] = Integer.parseInt(s);

            if (valoresInteirosSeparados[index] > 0 && A == 0){
                A = valoresInteirosSeparados[index];
            } else if (valoresInteirosSeparados[index] > 0 && i == 0) {
                i = valoresInteirosSeparados[index];
            } else if (A != 0 && i != 0){
                break;
            }

            index++;
        }

        for (int j = 0; j < i; j++) {
            somaTotal += (A + j);
        }

        System.out.println(somaTotal);

    }

}

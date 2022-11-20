package beecrowd.iniciante._1071_1099_._1074_;

import java.sql.Array;
import java.util.Scanner;

public class _1074_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros = sc.nextInt();
        int numeroDigitado;
        String imprimirMensagem [] = new String[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i++) {
            numeroDigitado = sc.nextInt();

            if (numeroDigitado < 0){
                if ((numeroDigitado % 2) == 0){
                    imprimirMensagem[i] = "EVEN NEGATIVE";
                } else {
                    imprimirMensagem[i] = "ODD NEGATIVE";
                }
            } else if (numeroDigitado > 0) {
                if ((numeroDigitado % 2) == 0){
                    imprimirMensagem[i] = "EVEN POSITIVE";
                } else {
                    imprimirMensagem[i] = "ODD POSITIVE";
                }
            } else {
                imprimirMensagem[i] = "NULL";
            }
        }

        for (String s : imprimirMensagem) {
            System.out.println(s);
        }

        sc.close();
    }
}

package beecrowd.iniciante._1021_1030_._1042_;

import java.util.Scanner;

public class _1042_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String numeros = sc.nextLine();

        String[] numerosSeparados = numeros.split(" ");

        int numerosIntSeparados[] = new int[numerosSeparados.length];
        int numerosIntOrdemEntrada[] = new int[numerosSeparados.length];

        for (int i = 0; i < numerosSeparados.length; i++) {
            numerosIntSeparados[i] = Integer.parseInt(numerosSeparados[i]);
            numerosIntOrdemEntrada[i] = Integer.parseInt(numerosSeparados[i]);
        }

        int aux;
        for (int i = 0; i < numerosIntSeparados.length; i++) {
            for (int j = i + 1; j < numerosIntSeparados.length; j++) {
                if (numerosIntSeparados[i] > numerosIntSeparados[j]){
                    aux = numerosIntSeparados[j];
                    numerosIntSeparados[j] = numerosIntSeparados[i];
                    numerosIntSeparados[i] = aux;
                }
            }
        }

        for (int n : numerosIntSeparados) {
            System.out.println(n);
        }

        System.out.println();

        for (int n : numerosIntOrdemEntrada) {
            System.out.println(n);
        }

        sc.close();

    }
}

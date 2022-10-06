package beecrowd.iniciante._1011_1020_._1013_;

import java.util.Scanner;

public class _1013_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String numeros = sc.nextLine();

        String[] numerosLista = numeros.split(" ");

        int numeroA = Double.valueOf(numerosLista[0]).intValue();
        int numeroB = Double.valueOf(numerosLista[1]).intValue();
        int numeroC = Double.valueOf(numerosLista[2]).intValue();


        int maiorAB = (numeroA + numeroB + Math.abs(numeroA - numeroB)) / 2;

        if (maiorAB > numeroC){
            System.out.println(maiorAB + " eh o maior");
        } else {
            System.out.println(numeroC + " eh o maior");
        }



    }
}

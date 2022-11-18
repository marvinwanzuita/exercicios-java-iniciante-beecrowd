package beecrowd.iniciante._1071_1099_._1072_;

import java.util.Scanner;

public class _1072_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros = sc.nextInt();
        int numeroLido;
        int numerosEntre10a20 = 0;
        int numerosFora10a20 = 0;

        for (int i = 0; i < quantidadeNumeros; i++) {
            numeroLido = sc.nextInt();
            if ((numeroLido >= 10) && (numeroLido <= 20)){
                numerosEntre10a20++;
            } else {
                numerosFora10a20++;
            }
        }

        System.out.println(numerosEntre10a20 + " in");
        System.out.println(numerosFora10a20 + " out");

        sc.close();
    }
}

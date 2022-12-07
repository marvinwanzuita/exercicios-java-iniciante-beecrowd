package beecrowd.iniciante._1101_1140_._1117_;

import java.util.Scanner;

public class _1117_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota;
        double total = 0;
        double media = 0;

        int quantidadeNotas = 0;

        do {

            nota = sc.nextDouble();

            if ((nota >= 0) && (nota <= 10)){
                total += nota;
                quantidadeNotas++;
            } else {
                System.out.println("nota invalida");
            }

            if (quantidadeNotas == 2){
                media = total / quantidadeNotas;
            }

        } while (quantidadeNotas != 2);

        System.out.println("media = " + String.format("%.2f", media));

    }
}

package beecrowd.iniciante._1141_1160_._1154_;

import java.util.Scanner;

public class _1154_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade;
        int quantidadeIdades = 0;
        int totalIdades = 0;
        double mediaIdades;

        while(true){

            idade = sc.nextInt();

            if (idade < 0){
                break;
            }

            totalIdades += idade;
            quantidadeIdades++;

        }

        mediaIdades = totalIdades / (double) quantidadeIdades;

        System.out.printf("%.2f%n", mediaIdades);

        sc.close();
    }

}

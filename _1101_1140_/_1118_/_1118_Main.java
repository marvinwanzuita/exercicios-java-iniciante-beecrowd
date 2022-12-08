package beecrowd.iniciante._1101_1140_._1118_;

import java.util.Scanner;

public class _1118_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota;
        double total = 0;
        double media = 0;

        int quantidadeNotas = 0;

        int respostaEncerrar = 1;

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
                System.out.println("media = " + String.format("%.2f", media));
                System.out.println("novo calculo (1-sim 2-nao)");
                respostaEncerrar = sc.nextInt();

                while (true){

                    if (respostaEncerrar == 1) {
                        quantidadeNotas = 0;
                        total = 0;
                        break;
                    } else if (respostaEncerrar == 2){
                        break;
                    } else {
                        System.out.println("novo calculo (1-sim 2-nao)");
                        respostaEncerrar = sc.nextInt();
                    }
                }
            }

        } while (respostaEncerrar != 2);

    }
}

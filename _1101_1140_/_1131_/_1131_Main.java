package beecrowd.iniciante._1101_1140_._1131_;

import java.util.Scanner;

public class _1131_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String placarJogo;
        String[] placarJogoSeparado;

        int golsInter;
        int golsGremio;

        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int empates = 0;

        int totalGrenais = 0;

        int respostaEncerrar;

        do {

            placarJogo = sc.nextLine();
            placarJogoSeparado = placarJogo.split(" ");

            golsInter = Integer.parseInt(placarJogoSeparado[0]);
            golsGremio = Integer.parseInt(placarJogoSeparado[1]);

            if (golsInter > golsGremio){
                vitoriasInter++;
            } else if (golsGremio > golsInter) {
                vitoriasGremio++;
            } else {
                empates++;
            }

            totalGrenais++;

            while (true){
                System.out.println("Novo grenal (1-sim 2-nao)");
                respostaEncerrar = sc.nextInt();
                sc.nextLine();

                if (respostaEncerrar == 1){
                    break;
                }

                if (respostaEncerrar == 2){

                    System.out.println(totalGrenais + " grenais");
                    System.out.println("Inter:" + vitoriasInter);
                    System.out.println("Gremio:" + vitoriasGremio);
                    System.out.println("Empates:" + empates);

                    if (vitoriasInter > vitoriasGremio){
                        System.out.println("Inter venceu mais");
                    } else if (vitoriasGremio > vitoriasInter) {
                        System.out.println("Gremio venceu mais");
                    } else {
                        System.out.println("Nao houve vencedor");
                    }
                    break;
                }
            }

        } while (respostaEncerrar != 2);

    }
}

package beecrowd.iniciante._1141_1160_._1145_;


import java.util.ArrayList;
import java.util.Scanner;

public class _1145_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String valores = sc.nextLine();

        String[] valoresDivididos = valores.split(" ");

        int X = Integer.parseInt(valoresDivididos[0]);
        int Y = Integer.parseInt(valoresDivididos[1]);

        int sequencia = 1;

        ArrayList<Integer> sequenciaImpressao = new ArrayList<>();

        for (int i = 1; i <= Y; i += X) {

            for (int j = 0; j < X; j++) {
                if (sequencia <= Y){
                    sequenciaImpressao.add(sequencia);
                    sequencia++;
                } else {
                    break;
                }
            }

            String impressaoSequencia = "";


            for (int n : sequenciaImpressao) {
                impressaoSequencia += Integer.toString(n) + " ";
            }

            System.out.println(impressaoSequencia.substring(0, impressaoSequencia.length() - 1));
            sequenciaImpressao.clear();
        }


    }

}

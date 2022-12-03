package beecrowd.iniciante._1101_1140_._1113_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1113_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String valoresInteiros;
        String[] valoresInteirosSeparados;

        int X;
        int Y;

        List<String> listaOrdens = new ArrayList<>();

        do {

            valoresInteiros = sc.nextLine();
            valoresInteirosSeparados = valoresInteiros.split(" ");

            X = Integer.parseInt(valoresInteirosSeparados[0]);
            Y = Integer.parseInt(valoresInteirosSeparados[1]);

            if (X == Y){
                break;
            }
            if (X < Y){
                listaOrdens.add("Crescente");
            } else {
                listaOrdens.add("Decrescente");
            }

        } while (X != Y);

        for (String l : listaOrdens) {
            System.out.println(l);
        }

    }
}

package beecrowd.iniciante._1141_1160_._1146_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1146_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        String impressaoSequencia;
        List<Integer> sequencia = new ArrayList<>();

        while (true){

            numero = sc.nextInt();

            impressaoSequencia = "";

            if (numero == 0){
                break;
            }

            for (int i = 1; i <= numero; i++) {
                sequencia.add(i);
            }

            for (int n : sequencia) {
                impressaoSequencia += Integer.toString(n) + " ";
            }

            impressaoSequencia = impressaoSequencia.substring(0, impressaoSequencia.length() - 1);

            System.out.println(impressaoSequencia);

            sequencia.clear();

        }

    }
}

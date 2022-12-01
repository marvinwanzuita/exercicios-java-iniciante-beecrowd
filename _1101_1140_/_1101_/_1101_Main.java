package beecrowd.iniciante._1101_1140_._1101_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1101_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String numerosLidos;

        String[] numerosLidosSeparados;

        int M;
        int N;
        int aux;
        int soma;

        String saida;
        List<String> listaSaida = new ArrayList<>();

        do {

            numerosLidos = sc.nextLine();

            numerosLidosSeparados = numerosLidos.split(" ");

            M = Integer.parseInt(numerosLidosSeparados[0]);
            N = Integer.parseInt(numerosLidosSeparados[1]);

            if (M > N) {
                aux = M;
                M = N;
                N = aux;
            }

            if (M <= 0 || N <= 0){
                break;
            }

            soma = 0;
            saida = "";

            for (int i = M; i <= N ; i++) {

                saida += Integer.toString(i) + " ";
                soma += i;
                if (i == N){
                    saida += "Sum="+ Integer.toString(soma);
                }
            }

            listaSaida.add(saida);

        } while (M != 0 || N != 0);

        for (String l : listaSaida) {
            System.out.println(l);
        }

    }

}

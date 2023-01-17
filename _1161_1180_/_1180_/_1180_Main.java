package beecrowd.iniciante._1161_1180_._1180_;

import java.util.Scanner;

public class _1180_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String X = sc.nextLine();
        String[] Xseparados = X.split(" ");
        int[] XArray = new int[N];

        int menorValor = 0;
        int posicaoMenorValor = 0;


        for (int i = 0; i < N; i++) {

            XArray[i] = Integer.parseInt(Xseparados[i]);

            if (i == 0){
                menorValor = XArray[i];
                posicaoMenorValor = i;
            }

            if (XArray[i] < menorValor) {
                menorValor = XArray[i];
                posicaoMenorValor = i;
            }


        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicaoMenorValor);

        sc.close();

    }
}

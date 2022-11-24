package beecrowd.iniciante._1071_1099_._1080_;

import java.util.Scanner;

public class _1080_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[100];

        int maiorNumero = 0;
        int posicaoMaiorNumero = 0;

        for (int i = 0; i < 100; i++) {

            numeros[i] = sc.nextInt();

            if (maiorNumero < numeros[i]){
                maiorNumero = numeros[i];
                posicaoMaiorNumero = i;
            }
        }

        System.out.println(maiorNumero);
        System.out.println(posicaoMaiorNumero + 1);

        sc.close();

    }
}

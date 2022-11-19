package beecrowd.iniciante._1071_1099_._1073_;

import java.util.Scanner;

public class _1073_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int totalQuadrado;

        for (int i = 1; i <= numero; i++) {

            if ((i % 2) == 0){
                totalQuadrado = (int) Math.pow((double) i, 2.0);
                System.out.println(i + "^" + 2 + " = " + totalQuadrado);
            }

        }

        sc.close();

    }
}

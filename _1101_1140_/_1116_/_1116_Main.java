package beecrowd.iniciante._1101_1140_._1116_;

import java.util.Scanner;

public class _1116_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String numeros;
        String[] NSeparados;

        double X;
        double Y;
        double resultado;

        for (int i = 0; i < N; i++) {

            numeros = sc.nextLine();
            NSeparados = numeros.split(" ");

            X = Double.parseDouble(NSeparados[0]);
            Y = Double.parseDouble(NSeparados[1]);

            if (Y == 0){
                System.out.println("divisao impossivel");
            } else {
                resultado = X / Y;
                System.out.printf("%.1f%n", resultado);
            }
        }
    }
}

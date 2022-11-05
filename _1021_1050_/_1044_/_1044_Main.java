package beecrowd.iniciante._1021_1050_._1044_;

import java.util.Scanner;

public class _1044_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String numeros = sc.nextLine();

        String[] numeroSeparados = numeros.split(" ");

        int A = Integer.parseInt(numeroSeparados[0]);
        int B = Integer.parseInt(numeroSeparados[1]);

        if ((B % A) == 0){
            System.out.println("Sao Multiplos");
        } else if ((A % B) == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}

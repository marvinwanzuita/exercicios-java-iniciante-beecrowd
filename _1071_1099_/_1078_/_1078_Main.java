package beecrowd.iniciante._1071_1099_._1078_;

import java.util.Scanner;

public class _1078_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            int total = i * numero;
            System.out.println(i + " x " + numero + " = " + total);
        }

        sc.close();

    }

}

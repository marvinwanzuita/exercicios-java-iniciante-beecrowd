package beecrowd.iniciante._1141_1160_._1144_;

import java.util.Scanner;

public class _1144_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadeSaidas= sc.nextInt();

        for (int i = 1; i <= quantidadeSaidas; i++) {
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
            System.out.println(i + " " + ((i * i) + 1) + " " + ((i * i * i) + 1));
        }


    }
}

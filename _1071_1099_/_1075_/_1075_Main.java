package beecrowd.iniciante._1071_1099_._1075_;

import java.util.Scanner;

public class _1075_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        for (int i = 1; i <= 10000; i++) {
            if ((i % numero) == 2){
                System.out.println(i);
            }
        }

        sc.close();

    }
}

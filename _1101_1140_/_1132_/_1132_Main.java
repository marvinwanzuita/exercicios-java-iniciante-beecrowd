package beecrowd.iniciante._1101_1140_._1132_;

import java.util.Scanner;

public class _1132_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int aux;
        int total = 0;

        if (X > Y){
            aux = Y;
            Y = X;
            X = aux;
        }

        for (int i = X; i <= Y ; i++) {
            if ((i % 13) != 0){
                total += i;
            }
        }

        System.out.println(total);

    }
}

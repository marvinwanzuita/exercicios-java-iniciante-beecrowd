package beecrowd.iniciante._1101_1140_._1133_;

import java.util.Scanner;

public class _1133_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int aux;

        if (X > Y){
            aux = Y;
            Y = X;
            X = aux;
        }

        for (int i = X + 1; i < Y; i++) {
            if (((i % 5) == 2) || ((i % 5) == 3)){
                System.out.println(i);
            }
        }


    }
}

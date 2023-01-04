package beecrowd.iniciante._1141_1160_._1159_;

import java.util.Scanner;

public class _1159_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X;
        int total;

        while (true){

            X = sc.nextInt();

            if (X == 0){
                break;
            } else if (X % 2 != 0){
                X++;
            }

            total = 0;

            for (int i = 0; i < 5; i++) {
                total += X;
                X += 2;
            }

            System.out.println(total);

        }

        sc.close();
    }
}

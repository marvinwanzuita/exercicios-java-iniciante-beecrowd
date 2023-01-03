package beecrowd.iniciante._1141_1160_._1158_;

import java.util.Scanner;

public class _1158_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String XY;
        String[] XYseparados;

        int X;
        int Y;
        int total;

        for (int i = 0; i < N; i++) {

            XY = sc.nextLine();
            XYseparados = XY.split(" ");

            X = Integer.parseInt(XYseparados[0]);
            Y = Integer.parseInt(XYseparados[1]);

            if (X % 2 == 0){
                X++;
            }

            total = 0;

            for (int j = 0; j < Y; j++) {
                total += X;
                X += 2;
            }

            System.out.println(total);
        }

    }
}

package beecrowd.iniciante._1141_1160_._1150_;

import java.util.Scanner;

public class _1150_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Z;

        int total = 0;
        int somados = 0;

        while (true){
            Z = sc.nextInt();

            if (Z > X){
                break;
            }
        }

        while (total < Z){
            total += (X + somados);
            somados++;
        }

        System.out.println(somados);
        sc.close();

    }
}

package beecrowd.iniciante._1071_1099_._1071_;

import java.util.Scanner;

public class _1071_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        int total = 0;

        if (numero1 < numero2){
            for (int i = numero1; i < numero2; i++) {
                if (((i % 2) == 0) && (i != numero1)) {
                    total += i;
                }
            }
        } else {
            for (int i = numero2; i < numero1; i++) {
                if (((i % 2) != 0) && (i != numero2)) {
                    total += i;
                }
            }
        }

        System.out.println(total);

        sc.close();

    }

}

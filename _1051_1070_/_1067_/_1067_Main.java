package beecrowd.iniciante._1051_1070_._1067_;

import java.util.Scanner;

public class _1067_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroDigitado = sc.nextInt();

        for (int i = 0; i <= numeroDigitado; i++) {
            if ((i % 2) != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }


}

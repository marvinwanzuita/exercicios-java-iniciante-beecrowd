package beecrowd.iniciante._1141_1160_._1160_;

import java.util.Scanner;

public class _1160_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        String PAePBeG1eG2;
        String[] PAePBeG1eG2separados;

        int PA, PB, anosTotais;
        double G1, G2;

        for (int i = 0; i < T; i++) {

            PAePBeG1eG2 = sc.nextLine();
            PAePBeG1eG2separados = PAePBeG1eG2.split(" ");

            PA = Integer.parseInt(PAePBeG1eG2separados[0]);
            PB = Integer.parseInt(PAePBeG1eG2separados[1]);
            G1 = Double.parseDouble(PAePBeG1eG2separados[2]);
            G2 = Double.parseDouble(PAePBeG1eG2separados[3]);

            anosTotais = 0;
            G1 /= 100;
            G2 /= 100;

            while (PA <= PB){
                PA += (PA * G1);
                PB += (PB * G2);
                anosTotais++;
                if (anosTotais > 100){
                    anosTotais = 101;
                    break;
                }
            }

            if (anosTotais > 100){
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anosTotais + " anos.");
            }

        }

        sc.close();
    }
}

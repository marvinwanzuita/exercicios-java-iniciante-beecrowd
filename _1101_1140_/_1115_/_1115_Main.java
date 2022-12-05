package beecrowd.iniciante._1101_1140_._1115_;

import java.util.Scanner;

public class _1115_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String coordenadas;
        String[] coordenadasSeparadas;

        int X;
        int Y;

        boolean coordenadaZero = false;

        do {

            coordenadas = sc.nextLine();
            coordenadasSeparadas = coordenadas.split(" ");

            X = Integer.parseInt(coordenadasSeparadas[0]);
            Y = Integer.parseInt(coordenadasSeparadas[1]);

            if ((X > 0) && (Y > 0)){
                System.out.println("primeiro");
            } else if ((X < 0) && (Y > 0)) {
                System.out.println("segundo");
            } else if ((X < 0) && (Y < 0)) {
                System.out.println("terceiro");
            } else if ((X > 0) && (Y < 0)) {
                System.out.println("quarto");
            } else {
                coordenadaZero = true;
            }

        } while (!coordenadaZero);

    }
}

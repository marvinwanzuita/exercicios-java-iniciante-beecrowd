package beecrowd.iniciante._1021_1030_._1041_;

import java.util.Scanner;

public class _1041_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String coordenadas = sc.nextLine();

        String[] coordenadasSeparadas = coordenadas.split(" ");

        double eixoX = Double.parseDouble(coordenadasSeparadas[0]);
        double eixoY = Double.parseDouble(coordenadasSeparadas[1]);

        boolean origem = (eixoX == 0) && (eixoY == 0);
        boolean sobreEixoX = (eixoY == 0);
        boolean sobreEixoY = (eixoX == 0);
        boolean quadrante1 = (eixoX >= 0) && (eixoY >= 0);
        boolean quadrante2 = (eixoX <= 0) && (eixoY >= 0);
        boolean quadrante3 = (eixoX <= 0) && (eixoY <= 0);
        boolean quadrante4 = (eixoX >= 0) && (eixoY <= 0);

        if (origem) {
            System.out.println("Origem");
        } else if (sobreEixoX) {
            System.out.println("Eixo X");
        } else if (sobreEixoY) {
            System.out.println("Eixo Y");
        } else if (quadrante1) {
            System.out.println("Q1");
        } else if (quadrante2) {
            System.out.println("Q2");
        } else if (quadrante3) {
            System.out.println("Q3");
        } else if (quadrante4) {
            System.out.println("Q4");
        }

    }

}

package beecrowd.iniciante._1011_1020_._1015_;

import java.util.Scanner;

public class _1015_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String eixo1 = sc.nextLine();
        String eixo2 = sc.nextLine();

        String[] eixo1Lista = eixo1.split(" ");
        String[] eixo2Lista = eixo2.split(" ");

        Double x1 = Double.valueOf(eixo1Lista[0]);
        Double y1 = Double.valueOf(eixo1Lista[1]);

        Double x2 = Double.valueOf(eixo2Lista[0]);
        Double y2 = Double.valueOf(eixo2Lista[1]);

        Double medidaX = Math.pow((x2 - x1), 2);
        Double medidaY = Math.pow((y2 - y1), 2);

        Double distancia = Math.sqrt(medidaX + medidaY);

        System.out.println(String.format("%.4f", distancia));

    }
}

package beecrowd.iniciante._1011_1020_._1019_;

import java.util.Scanner;

public class _1019_Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int segundosTotais = sc.nextInt();

        int horas = segundosTotais / 3600;
        int segundosRestantes = segundosTotais - (horas * 3600);
        int minutos = segundosRestantes / 60;
        segundosRestantes = segundosRestantes - (minutos * 60);
        int segundos = segundosRestantes;

        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}

package beecrowd.iniciante._1051_1070_._1061_;

import java.util.Scanner;

public class _1061_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String diaIniciado = sc.nextLine();
        String horaIniciado = sc.nextLine();
        String diaFinalizado = sc.nextLine();
        String horaFinalizado = sc.nextLine();

        String[] diaInicialSeparado = diaIniciado.split(" ");
        int diaInicial = Integer.parseInt(diaInicialSeparado[1]);

        String[] horaInicialSeparado = horaIniciado.split(" ");
        int horaInicial = Integer.parseInt(horaInicialSeparado[0]);
        int minutoInicial = Integer.parseInt(horaInicialSeparado[2]);
        int segundoInicial = Integer.parseInt(horaInicialSeparado[4]);

        String[] diaFinalSeparado = diaFinalizado.split(" ");
        int diaFinal = Integer.parseInt(diaFinalSeparado[1]);

        String[] horaFinalSeparado = horaFinalizado.split(" ");
        int horaFinal = Integer.parseInt(horaFinalSeparado[0]);
        int minutoFinal = Integer.parseInt(horaFinalSeparado[2]);
        int segundoFinal = Integer.parseInt(horaFinalSeparado[4]);

        int diasTotais = diaFinal - diaInicial;
        int horasTotais = 0;
        int minutosTotais = 0;
        int segundosTotais = 0;

        if (horaFinal > horaInicial){
            horasTotais = horaFinal - horaInicial;
        } else if (horaFinal < horaInicial){
            horasTotais = (24 - horaInicial) + horaFinal;
            diasTotais--;
        }

        if (minutoFinal > minutoInicial){
            minutosTotais = minutoFinal - minutoInicial;
        } else if (minutoFinal < minutoInicial){
            minutosTotais = (60 - minutoInicial) + minutoFinal;
            horasTotais++;
            if (horasTotais > 23){
                horasTotais = 0;
            }
        }

        if (segundoFinal > segundoInicial){
            segundosTotais = segundoFinal - segundoInicial;
        } else if (segundoFinal < segundoInicial) {
            segundosTotais = (60 - segundoInicial) + segundoFinal;
            minutosTotais++;
            if (minutosTotais > 59){
                minutosTotais++;
            }
        }

        System.out.println(diasTotais + " dia(s)");
        System.out.println(horasTotais + " hora(s)");
        System.out.println(minutosTotais + " minuto(s)");
        System.out.println(segundosTotais + " segundo(s)");

        sc.close();
    }
}

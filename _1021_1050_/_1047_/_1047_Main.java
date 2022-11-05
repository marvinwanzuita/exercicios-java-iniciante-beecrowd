package beecrowd.iniciante._1021_1050_._1047_;

import java.util.Scanner;

public class _1047_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String horarios = sc.nextLine();

        String[] horariosSeparados = horarios.split(" ");

        int horaInicial = Integer.parseInt(horariosSeparados[0]);
        int minutoInicial = Integer.parseInt(horariosSeparados[1]);
        int horaFinal = Integer.parseInt(horariosSeparados[2]);
        int minutoFinal = Integer.parseInt(horariosSeparados[3]);

        int duracaoHorasJogo = 0;
        int duracaoMinutosJogo = 0;
        final int HORAS_POR_DIA = 24;
        final int MINUTOS_POR_HORA = 60;

        if (horaFinal > horaInicial){
            duracaoHorasJogo = horaFinal - horaInicial;
        } else if (horaInicial > horaFinal) {
            duracaoHorasJogo = (HORAS_POR_DIA - horaInicial);
            duracaoHorasJogo += horaFinal;
        } else {
            duracaoHorasJogo = HORAS_POR_DIA;
        }

        if (minutoFinal > minutoInicial){
            duracaoMinutosJogo = minutoFinal - minutoInicial;
            if (horaInicial == horaFinal){
                duracaoHorasJogo = 0;
            }
        } else if (minutoInicial > minutoFinal) {
            duracaoMinutosJogo = (MINUTOS_POR_HORA - minutoInicial);
            duracaoMinutosJogo += minutoFinal;
            duracaoHorasJogo--;
        } else {
            duracaoMinutosJogo = 0;
        }

        System.out.println("O JOGO DUROU " + duracaoHorasJogo + " HORA(S) E " + duracaoMinutosJogo + " MINUTO(S)");

        sc.close();
    }
}

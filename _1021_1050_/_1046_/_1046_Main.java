package beecrowd.iniciante._1021_1050_._1046_;

import java.util.Scanner;

public class _1046_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String horarios = sc.nextLine();

        String[] horariosSeparados = horarios.split(" ");

        int horaInicio = Integer.parseInt(horariosSeparados[0]);
        int horaFinal = Integer.parseInt(horariosSeparados[1]);
        int duracaoJogo = 0;

        if (horaFinal > horaInicio){
            duracaoJogo = horaFinal - horaInicio;
        } else if (horaInicio > horaFinal) {
            duracaoJogo = (24 - horaInicio);
            duracaoJogo += horaFinal;
        } else {
            duracaoJogo = 24;
        }

        System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");

        sc.close();
    }

}

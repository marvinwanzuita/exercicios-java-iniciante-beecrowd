package beecrowd.iniciante._1021_1030_._1040_;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class _1040_Main_2 {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);

        String notas = sc.nextLine();

        String[] notasSeparadas = notas.split(" ");

        double N1 = Double.parseDouble(notasSeparadas[0]);
        double N2 = Double.parseDouble(notasSeparadas[1]);
        double N3 = Double.parseDouble(notasSeparadas[2]);
        double N4 = Double.parseDouble(notasSeparadas[3]);

        final int PESO_NOTA_1 = 2;
        final int PESO_NOTA_2 = 3;
        final int PESO_NOTA_3 = 4;
        final int PESO_NOTA_4 = 1;
        final int DIVISOR_EXAME = 2;

        final int MEDIA_APROVADO = 7;
        final int MEDIA_EM_EXAME = 5;

        double pesoTotal = PESO_NOTA_1 + PESO_NOTA_2 + PESO_NOTA_3 + PESO_NOTA_4;

        double media = ((N1 * PESO_NOTA_1) + (N2 * PESO_NOTA_2) + (N3 * PESO_NOTA_3) + (N4 * PESO_NOTA_4)) / pesoTotal;

        DecimalFormat df1 = new DecimalFormat("0.0");
        DecimalFormat df2 = new DecimalFormat("0.00");

        System.out.println();
        System.out.println(media);
        System.out.printf("%.1f%n", media);
        System.out.printf("%.2f%n", media);
        System.out.printf("%.3f%n", media);
        System.out.printf("%.4f%n", media);

        System.out.println();

        df1.setRoundingMode(RoundingMode.DOWN);
        System.out.println(df1.format(media));

        df2.setRoundingMode(RoundingMode.DOWN);
        System.out.println(df2.format(media));




        double notaExame = 0;
        double mediaExame = 0;
//
//        if (media >= MEDIA_APROVADO) {
//            System.out.println("Media: " + String.format("%.1f", media));
//            System.out.println("Aluno aprovado.");
//        } else if (media >= MEDIA_EM_EXAME) {
//            System.out.println("Media: " + String.format("%.1f", media));
//            System.out.println("Aluno em exame.");
//            System.out.print("Nota do exame: ");
//            notaExame = sc.nextDouble();
//            mediaExame = (media + notaExame) / DIVISOR_EXAME;
//            if (mediaExame >= MEDIA_EM_EXAME){
//                System.out.println("Aluno aprovado.");
//                System.out.println("Media final: " + String.format("%.1f", mediaExame));
//            } else {
//                System.out.println("Aluno reprovado.");
//                System.out.println("Media final: " + String.format("%.1f", mediaExame));
//            }
//        } else {
//            System.out.println("Media: " + String.format("%.1f", media));
//            System.out.println("Aluno reprovado.");
//        }

    }

}

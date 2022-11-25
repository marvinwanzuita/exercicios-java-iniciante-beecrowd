package beecrowd.iniciante._1071_1099_._1094_;

import java.util.Scanner;

public class _1094_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadeTestes = sc.nextInt();
        sc.nextLine();

        String entradaTeste;

        int quantidadeAnimal;
        String codigoCobaia;

        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;

        double totalCobais = 0;

        double porcentagemCoelhos = 0;
        double porcentagemRatos = 0;
        double porcentagemSapos = 0;

        for (int i = 0; i < quantidadeTestes; i++) {

            entradaTeste = sc.nextLine();

            String[] entradaTesteSeparado = entradaTeste.split(" ");
            quantidadeAnimal = Integer.parseInt(entradaTesteSeparado[0]);
            codigoCobaia = entradaTesteSeparado[1];

            if (codigoCobaia.equals("C")){
                coelhos += quantidadeAnimal;
                totalCobais += quantidadeAnimal;
            } else if (codigoCobaia.equals("R")) {
                ratos += quantidadeAnimal;
                totalCobais += quantidadeAnimal;
            } else if (codigoCobaia.equals("S")) {
                sapos += quantidadeAnimal;
                totalCobais += quantidadeAnimal;
            }

            porcentagemCoelhos = (coelhos * 100) / totalCobais;
            porcentagemRatos = (ratos * 100) / totalCobais;
            porcentagemSapos = (sapos * 100) / totalCobais;

        }

        System.out.println("Total: " + (int) totalCobais + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.println("Percentual de coelhos: " + String.format("%.2f", porcentagemCoelhos) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", porcentagemRatos) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", porcentagemSapos) + " %");


        sc.close();

    }

}

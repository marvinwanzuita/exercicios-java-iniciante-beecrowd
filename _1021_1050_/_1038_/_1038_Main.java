package beecrowd.iniciante._1021_1050_._1038_;

import java.util.Scanner;

public class _1038_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String codigoEQuantidade = sc.nextLine();

        String[] codigoEQuantidadeSeparados = codigoEQuantidade.split(" ");

        int codigo = Integer.parseInt(codigoEQuantidadeSeparados[0]);
        int quantidade = Integer.parseInt(codigoEQuantidadeSeparados[1]);

        final double CACHORRO_QUENTE = 4.00;
        final double X_SALADA = 4.50;
        final double X_BACON = 5.00;
        final double TORRADA_SIMPLES = 2.00;
        final double REFRIGERANTE = 1.50;

        switch (codigo){
            case 1:
                System.out.println("Total: R$ " + String.format("%.2f", CACHORRO_QUENTE * quantidade));
                break;
            case 2:
                System.out.println("Total: R$ " + String.format("%.2f", X_SALADA * quantidade));
                break;
            case 3:
                System.out.println("Total: R$ " + String.format("%.2f", X_BACON * quantidade));
                break;
            case 4:
                System.out.println("Total: R$ " + String.format("%.2f", TORRADA_SIMPLES * quantidade));
                break;
            case 5:
                System.out.println("Total: R$ " + String.format("%.2f", REFRIGERANTE * quantidade));
                break;
            default:
                System.out.println("Código inválido");
        }
    }
}

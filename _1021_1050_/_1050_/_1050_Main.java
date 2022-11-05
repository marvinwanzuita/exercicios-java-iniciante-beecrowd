package beecrowd.iniciante._1021_1050_._1050_;

import java.util.Scanner;

public class _1050_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigoDDD = sc.nextInt();

        String cidadeCodigo = "";

        switch (codigoDDD){
            case 61:
                cidadeCodigo = "Brasilia";
                break;
            case 71:
                cidadeCodigo = "Salvador";
                break;
            case 11:
                cidadeCodigo = "Sao Paulo";
                break;
            case 21:
                cidadeCodigo = "Rio de Janeiro";
                break;
            case 32:
                cidadeCodigo = "Juiz de Fora";
                break;
            case 19:
                cidadeCodigo = "Campinas";
                break;
            case 27:
                cidadeCodigo = "Vitoria";
                break;
            case 31:
                cidadeCodigo = "Belo Horizonte";
                break;
            default:
                cidadeCodigo = "DDD nao cadastrado";
        }

        System.out.println(cidadeCodigo);

        sc.close();
    }
}

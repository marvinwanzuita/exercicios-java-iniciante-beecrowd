package beecrowd.iniciante._1101_1140_._1134_;

import java.util.Scanner;

public class _1134_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigoCombustivel;

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        boolean continuarPerguntando = true;


        while (continuarPerguntando){

            codigoCombustivel = sc.nextInt();

            switch (codigoCombustivel) {
                case 1 -> alcool++;
                case 2 -> gasolina++;
                case 3 -> diesel++;
                case 4 -> continuarPerguntando = false;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }
}

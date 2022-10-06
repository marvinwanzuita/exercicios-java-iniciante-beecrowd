package beecrowd.iniciante._1011_1020_._1020_;

import java.util.Scanner;

public class _1020_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int diasTotais = sc.nextInt();

        int anos = diasTotais / 365;
        int diasRestantes = diasTotais - (anos * 365);
        System.out.println(diasRestantes);

        int meses = diasRestantes / 30;
        diasRestantes -= (meses * 30);

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(diasRestantes + " dia(s)");

    }

}

package beecrowd.iniciante._1141_1160_._1142_;

import java.util.Scanner;

public class _1142_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadeLinhas = sc.nextInt();
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;

        for (int i = 0; i < quantidadeLinhas; i++) {
            System.out.println(n1 + " " + n2 + " " + n3 + " PUM" );
            n1 += 4;
            n2 += 4;
            n3 += 4;
        }
        
    }
}

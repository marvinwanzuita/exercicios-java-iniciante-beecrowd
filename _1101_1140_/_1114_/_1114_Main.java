package beecrowd.iniciante._1101_1140_._1114_;

import java.util.Scanner;

public class _1114_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 2002;
        int senhaRecebida;

        boolean acessoLiberado = false;

        do {

            senhaRecebida = sc.nextInt();

            if (senhaRecebida == senhaCorreta){
                System.out.println("Acesso Permitido");
                acessoLiberado = true;
            } else {
                System.out.println("Senha Invalida");
            }

        } while (!acessoLiberado);
    }
}

package beecrowd.iniciante._1021_1030_._1045_;

import java.util.Scanner;

public class _1045_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String numeros = sc.nextLine();

        String[] numerosSeparados = numeros.split(" ");

        double numerosIntSeparados[] = new double[numerosSeparados.length];

        for (int i = 0; i < numerosSeparados.length; i++) {
            numerosIntSeparados[i] = Double.parseDouble(numerosSeparados[i]);
        }

        double aux;
        for (int i = 0; i < numerosIntSeparados.length; i++) {
            for (int j = i + 1; j < numerosIntSeparados.length; j++) {
                if (numerosIntSeparados[i] < numerosIntSeparados[j]){
                    aux = numerosIntSeparados[j];
                    numerosIntSeparados[j] = numerosIntSeparados[i];
                    numerosIntSeparados[i] = aux;
                }
            }
        }

        double A = numerosIntSeparados[0];
        double B = numerosIntSeparados[1];
        double C = numerosIntSeparados[2];

        boolean naoFormaTriangulo = A >= (B + C);
        boolean trianguloRetangulo = Math.pow(A, 2) == ((Math.pow(B, 2) + Math.pow(C,2)));
        boolean trianguloObtusangulo = Math.pow(A, 2) > ((Math.pow(B, 2) + Math.pow(C,2)));
        boolean trianguloAcutangulo = Math.pow(A, 2) < ((Math.pow(B, 2) + Math.pow(C,2)));
        boolean trinaguloEquilatero = (A == B) && (B == C);
        boolean trianguloIsoscelesABiguais = (A == B) && (A != C) & (B != C);
        boolean trianguloIsoscelesACiguais = (A == C) && (B != A) & (B != C);
        boolean trianguloIsoscelesBCiguais = (B == C) && (A != C) & (B != A);

        if (naoFormaTriangulo){
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (trianguloRetangulo) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (trianguloObtusangulo) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (trianguloAcutangulo) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (trinaguloEquilatero) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if (trianguloIsoscelesABiguais){
                System.out.println("TRIANGULO ISOSCELES");
            }
            if (trianguloIsoscelesACiguais){
                System.out.println("TRIANGULO ISOSCELES");
            }
            if (trianguloIsoscelesBCiguais){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }


    }
}

package beecrowd.iniciante._1141_1160_._1156_;

public class _1156_Main {

    public static void main(String[] args) {

        double S = 1;
        double D = 2;

        for (double i = 3; i <= 39; i += 2) {
            S += i / D;
            D *= 2;
        }

        System.out.printf("%.2f%n", S);



    }
}

package beecrowd.iniciante._1071_1099_._1098_;

public class _1098_Main {

    public static void main(String[] args) {

        double j;

        for (double i = 0; i <= 2 ; i += 0.2) {
            j = 1;
            j += i;
            for (int k = 0; k < 3; k++) {


                if (i == 0 || i == 1 || i > 1.9){
                    System.out.println("I=" + String.format("%.0f", i) + " J=" + String.format("%.0f", j) );
                } else {
                    System.out.println("I=" + String.format("%.1f", i) + " J=" + String.format("%.1f", j) );
                }

                j += 1;
            }

        }


    }

}

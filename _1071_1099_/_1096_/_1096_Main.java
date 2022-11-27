package beecrowd.iniciante._1071_1099_._1096_;

public class _1096_Main {

    public static void main(String[] args) {

        int i = 1;

        for (int j = 7; j >= 5 ; j--) {
            System.out.println("I=" + i + " J=" + j );
            if (j == 5){
                i += 2;
                j = 8;
            }
            if (i > 10){
                break;
            }
        }

    }
}

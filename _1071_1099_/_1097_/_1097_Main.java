package beecrowd.iniciante._1071_1099_._1097_;

public class _1097_Main {

    public static void main(String[] args) {

        int i = 1;
        int j = 7;

        for (int k = 1; k < 4 ; k++) {
            System.out.println("I=" + i + " J=" + j );
            j--;
            if (k == 3){
                j += 5;
                i += 2;
                k = 0;
            }
            if (i > 10){
                break;
            }
        }

    }


}

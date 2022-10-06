package beecrowd.iniciante._1003_1010_._1010_;

import java.text.ParseException;
import java.util.Scanner;

public class _1010_Main {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        String piece1 = sc.nextLine();
        String piece2 = sc.nextLine();

        String[] piece1List = piece1.split(" ");
        String piece2List[] = piece2.split(" ");

        int partCode1 = Integer.parseInt(piece1List[0]);
        int partCode2 = Integer.parseInt(piece2List[0]);

        int numberOfPieces1 = Integer.parseInt(piece1List[1]);
        int numberOfPieces2 = Integer.parseInt(piece2List[1]);

        Double unitaryValue1 = Double.valueOf(piece1List[2]).doubleValue();
        Double unitaryValue2 = Double.valueOf(piece2List[2]).doubleValue();

        double totalPayable = (numberOfPieces1 * unitaryValue1) + (numberOfPieces2 * unitaryValue2);

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", totalPayable));

    }

}

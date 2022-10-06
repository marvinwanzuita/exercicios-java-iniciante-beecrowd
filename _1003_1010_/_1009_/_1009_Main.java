package beecrowd.iniciante._1003_1010_._1009_;

import java.util.Scanner;

public class _1009_Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sellerName = sc.nextLine();
        double fixedSalary = sc.nextDouble();
        double salesMade = sc.nextDouble();

        double totalSalary = fixedSalary + (salesMade * 0.15);

        System.out.println("TOTAL = R$ " + String.format("%.2f", totalSalary));

    }
}

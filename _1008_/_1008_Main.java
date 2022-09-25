package beecrowd.iniciante._1008_;

import java.util.Scanner;

public class _1008_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int employeeNumber = sc.nextInt();
        int workedHours = sc.nextInt();
        double valuePerHours = sc.nextDouble();

        double salary = workedHours * valuePerHours;

        System.out.println("NUMBER = " + employeeNumber);
        System.out.println("SALARY = U$ " + String.format("%.2f", salary ));

    }
}

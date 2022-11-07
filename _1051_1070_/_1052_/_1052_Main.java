package beecrowd.iniciante._1051_1070_._1052_;

import java.util.Scanner;

public class _1052_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mes = sc.nextInt();

        String mesIngles = "";

        switch (mes){

            case 1:
                mesIngles = "January";
                break;
            case 2:
                mesIngles = "February";
                break;
            case 3:
                mesIngles = "March";
                break;
            case 4:
                mesIngles = "April";
                break;
            case 5:
                mesIngles = "May";
                break;
            case 6:
                mesIngles = "June";
                break;
            case 7:
                mesIngles = "July";
                break;
            case 8:
                mesIngles = "August";
                break;
            case 9:
                mesIngles = "September";
                break;
            case 10:
                mesIngles = "October";
                break;
            case 11:
                mesIngles = "November";
                break;
            case 12:
                mesIngles = "December";
                break;
        }

        System.out.println(mesIngles);

        sc.close();

    }
}

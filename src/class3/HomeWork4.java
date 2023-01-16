package class3;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your birth month");
        String month=scan.nextLine();
        if (month.equalsIgnoreCase("june")||month.equalsIgnoreCase("july")||
            month.equalsIgnoreCase("august")){
            System.out.println("you were born in summer");
        } else if (month.equalsIgnoreCase("december")||month.equalsIgnoreCase("january")||
                month.equalsIgnoreCase("february")) {
            System.out.println("you were born in winter");
        } else if (month.equalsIgnoreCase("march")||month.equalsIgnoreCase("april")||
                month.equalsIgnoreCase("may")) {
            System.out.println("you were born in spring");
        } else if (month.equalsIgnoreCase("september")||month.equalsIgnoreCase("october")||
                month.equalsIgnoreCase("november")) {
            System.out.println("you were born in fall");

            
        }
    }
}

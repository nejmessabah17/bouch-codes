package class4;

import java.time.Year;
import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter numbers of worked years");
        int worked = inp.nextInt();
        System.out.println("enter annual salary");
        int salary = inp.nextInt();
        if (worked >= 5) {
            System.out.println("eligible for the bonus");
            if (salary > 50000) {
                System.out.println("bonus=5000");
            } else {
                System.out.println("bonus=3000");
            }
        } else {
            System.out.println("he is not eligible for the bonus");

        }
    }
}


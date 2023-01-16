package class3;

import java.util.Scanner;

public class H0meWork2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter day");
        int day = scan.nextInt();
        if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
            System.out.println("it is a weekday");

        } else if (day == 6 || day == 7) {
            System.out.println("it is a weekend");
        } else {


            System.out.println("invalid day");
        }
    }
}


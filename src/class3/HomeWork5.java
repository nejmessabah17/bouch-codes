package class3;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter three distinct number");
         double number1= scan.nextDouble();
         double number2=scan.nextDouble();
         double number3= scan.nextDouble();
        if (number1>number2 && number1>number3){
            System.out.println("the largest number is "+ number1);
        } else if (number2>number1 && number2>number3) {
            System.out.println("the largest number is "+ number2);

        } else if (number3>number1 && number3>number2) {
            System.out.println("the largest number is "+ number3);

        }
    }
}

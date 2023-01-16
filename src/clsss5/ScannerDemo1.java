package clsss5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println();


        System.out.println("please enter your age");
        int age= scan.nextInt();
        System.out.println("you ara "+age+" years old");
        System.out.println("please enter your your weight");
        double weight =scan.nextDouble();
        System.out.println("your weight is "+weight+" kgs");
        System.out.println("Are you hungry");
        boolean hungry=scan.nextBoolean();
        System.out.println("hungry "+hungry);
        System.out.println("please enter your gender");
        char gender=scan.next().charAt(0);
        System.out.println("your gender is "+gender);

    }
}

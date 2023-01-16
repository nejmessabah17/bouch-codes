package class4;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("what is your city");
        String city= inp.next();
        System.out.println("what is the temperature");
        int temp= inp.nextInt();
        System.out.println("the temperature in the " +  city + " is "+((temp-32)*5/9 ));



    }
}

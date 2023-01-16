package Class9;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*create a program that will be asking user to apply for acredit card 10 times
        as soon you get an " yes"from user

         */

        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.println("do you want a credit card ");
            String userResponse=scanner.next();
            if (userResponse.equalsIgnoreCase("yes")){
                break;
            }
        }


    }
}

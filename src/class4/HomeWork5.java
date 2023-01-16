package class4;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(" do you have a credit card");
        boolean card = inp.nextBoolean();
        if (card) {
            System.out.println("what is balance on the card?");
            int balance = inp.nextInt();
            if (balance > 1000) {
                System.out.println("pay off immediately");
            } else {
                System.out.println("you can spend more");}





        }else{
                System.out.println(" will offer card for you ");
            }
        }
    }



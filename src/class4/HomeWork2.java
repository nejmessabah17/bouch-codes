package class4;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("what is the amount of loan is needed");
        int loan= inp.nextInt();

        if (loan<=200000){
            System.out.println("would lend the money");

        }else{
            System.out.println("would reject the client");
        }
    }
}
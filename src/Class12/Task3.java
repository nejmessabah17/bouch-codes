package Class12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //3) Write a program that reads two people's first
        // names and if they expecting boy or girl?
        //Based on the input suggests a name for a baby:
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? boy
        //Suggested baby name: DANRY

        Scanner scan=new Scanner(System.in);
        System.out.println("Mom’s first name? ");
        String mom=scan.nextLine();
        System.out.println("Dad’s first name?");
        String dad=scan.nextLine();
        System.out.println("Boy or Girl? ");
        String baby=scan.nextLine();
        if (baby.equals("boy")){
            System.out.println("DANRY");

        } else if (baby.equals("girl")) {
            System.out.println("SARA");

        }


    }
}

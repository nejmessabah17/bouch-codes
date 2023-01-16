package Class7;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {

        boolean condition=true;
        Scanner scanner=new Scanner(System.in);
        int number=15;

        while (condition){
            System.out.println("please enter number between 10 to 20");
            int userInput=scanner.nextInt();
            if (userInput>number){
                System.out.println("please entered number is greater");
            } else if (userInput<number){
                System.out.println("you entered a smaller number");

            }else {
                System.out.println("you won!!!!");
                condition=false;
            }
        }
    }
}

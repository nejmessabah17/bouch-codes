package Class7;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int number=0;
        do {
            System.out.println("please enter a number");
            number=scanner.nextInt();

        }while (number!=5);

    }
}

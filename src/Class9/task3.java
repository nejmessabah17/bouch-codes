package Class9;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
       /*
       write a program that reads a range of integers
       ( start and end point) provided by a user and then from that
       range points the sum of the even and add integers

        */
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter tow numbers starting point and ending point");
        int start = scanner.nextInt();
        int end=scanner.nextInt();
        System.out.println("start "+start+" end "+end);
        int evenSum=0;
        int oddSum=0;

        for (int i=start;i<=end;i++){
            if (i % 2 == 0) {
                evenSum+=i;   // can also be written like evenSum =evenSum+i
            }else {
                oddSum+=i;    // can also be written like oddSum = oddSum+i
                System.out.println("sum of all the even numbers "+evenSum);

                System.out.println("sum of all the odd numbers "+oddSum);
            }

        }



    }
}

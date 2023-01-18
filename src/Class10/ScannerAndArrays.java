package Class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter 5 numbers");

        int[] numbers = new int[5];
        //below code take the numbers from user
   /*     numbers[0] = 40;
        numbers[1] = 50;
        numbers[2] = 60;
        numbers[3] = 70;
        numbers[4] = 80;


         numbers[0] =Scanner.nextInt
        numbers[1] = Scanner.nextInt
        numbers[2] = Scanner.nextInt
        numbers[3] = Scanner.nextInt
        numbers[4] =Scanner.nextInt
        


        */

    //below code uses a normal for loop to ask the user for numbers and store
    for (int i=0;i< numbers.length;i++) {
        numbers[i]= scanner.nextInt();

    }
        System.out.println(Arrays.toString(numbers));

    }
}
package Class0;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 5 numbers");
        int[] numbers = new int[5];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = scanner.nextInt();
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}

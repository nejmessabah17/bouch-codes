package class4;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("what's your age");
        int age= inp.nextInt();
        if (age>=18) {
            System.out.println("you will issue a driver licence");
        }else {
            System.out.println("you will get a learners permit");
        }
    }
}

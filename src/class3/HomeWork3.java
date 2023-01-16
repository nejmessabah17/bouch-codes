package class3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("enter your grade");
        int score=inp.nextInt();
        if (score>=90){
            System.out.println("your grade=A");
        } else if (score>=70 && score<90) {
            System.out.println("your grade=B");

        } else if (score>=50 && score<70) {
            System.out.println("your grade=C");

        } else if (score<50) {
            System.out.println("your grade=F");

        }


    }

}
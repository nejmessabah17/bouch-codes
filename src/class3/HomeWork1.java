package class3;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("please enter your heights in inch");
        int height=inp.nextInt();
        if (height<60) {
            System.out.println("he is short");
        } else if (height>60 && height<70 ) {
            System.out.println("he is medium");
        }else if (height>72){
                 System.out.println("he is tall");


        }
    }
}

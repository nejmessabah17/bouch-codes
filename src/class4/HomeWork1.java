package class4;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        int mortgageRate = 2;
        int housePrice = 300000;
        if (mortgageRate < 4.5) {

            System.out.println("will buy house");

            if (housePrice > 200000) {

                System.out.println("will take a loan");
            } else {
                System.out.println("will pay cash");}

        }else {
            System.out.println("will not buy house");


        }
    }
}

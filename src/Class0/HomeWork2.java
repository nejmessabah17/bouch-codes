package Class0;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        //2)Using Scanner create an array of countries. When an array is created,
        // retrieve all values from it and while retrieving those values print capital for each country.


        Scanner scanner = new Scanner(System.in);

        String[] countries = {"France", "Morocco", "USA", "Mexico"};

        for (int i = 0; i < countries.length; i++) {

            System.out.println(" enter the capital of " + countries[i]);
            String capital = scanner.next();
            System.out.println("the capital of " + countries[i]+" is "+capital );
        }
    }

}


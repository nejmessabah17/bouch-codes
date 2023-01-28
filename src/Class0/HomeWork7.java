package Class0;

public class HomeWork7 {
    public static void main(String[] args) {
        //Write a java program to check whether a given number is prime or not?
        int count = 0;
        int x = 7;
        for (int i = 1; i <= x; i++)

            if (x % i == 0) {
                count++;
            }
        if (count == 2) {
            System.out.println("prime");
        } else {


        System.out.println("not prime");

    }

    }


}

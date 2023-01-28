package Class0;

public class HomeWork8 {
    public static void main(String[] args) {
        //Write a Java Program to print the first 10 numbers of Fibonacci series
        int a=0,b=1,c=0;

        for (int i=0;b<=10;i++){
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
    }
}

package Class7;

public class Task2 {
    public static void main(String[] args) {
        int num=1;

        // using a for loop print odd numbers from 1 to 20;

        for (num=0;num<20;num++ ) {
            if (num % 2 != 0) {
                System.out.println(num);
            }

        }

        System.out.println("************");
        for (int i = 1; i<20 ; i+=2){
            System.out.println(i);
        }

    }
}

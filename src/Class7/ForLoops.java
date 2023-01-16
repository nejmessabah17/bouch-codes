package Class7;

public class ForLoops {
    public static void main(String[] args) {

        /*
         print number from 0 to 9

        */

        int number=0;// creat a variable of type int
        while (number<10){ // checks the condition if condition is true excute the code in the body of while loop
            System.out.println(number);// prints the value of number on the console
            number++;  // it adds one to the number variable
        }
         /*
         (initialize ; condition ; increment or decrement)
          */
        for (int i=0;i<10;i++){
            System.out.println(i);
        }

    }
}

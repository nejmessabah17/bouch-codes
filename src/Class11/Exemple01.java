package Class11;

public class Exemple01 {
    public static void main(String[] args) {


        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };
//foreach loop to print all the numbers from 2D array
        for (int[] arr:matrix) {

            for (int number:arr){
                System.out.print(number+" ");







            }

        }
    }
}

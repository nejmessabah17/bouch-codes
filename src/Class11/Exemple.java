package Class11;

import java.util.Arrays;

public class Exemple {
    public static void main(String[] args) {


        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };
//write a loop to print aii the elements from this 2D array
//matrix.length tells us how many 1D arrays are present in this 2D array
        for (int i = 0; i < matrix.length; i++) {

// matrix[i].lenght the size of each 1D arrays
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
}

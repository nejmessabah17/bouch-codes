package Class0;

public class HomeWork4 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 5},
                           {3, 4, 6},
                            {7,8,9}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {


                if (numbers[i][j] % 2 == 0)


                    System.out.println(numbers[i][j]);
                }
            }
        }
    }

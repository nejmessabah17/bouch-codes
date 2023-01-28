package Class0;

public class HomeWork5 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3},
                           {4, 5, 6},};
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i][j] % 2 == 0) {


                    evenSum = evenSum + numbers[i][j];


                } else if (numbers[i][j] % 2 != 0) {
                    oddSum = oddSum + numbers[i][j];
                }
            }
        }
                    System.out.println(evenSum);
                    System.out.println(oddSum);
                }


            }





package Class0;

public class HomeWork3 {
    public static void main(String[] args) {
        int[][] numbers={{12,10,15},
                         {13,14,20}};
        int sum=0;
        for (int i=0;i< numbers.length;i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                sum = sum + numbers[i][j];

            }
        }
        System.out.println(sum);

    }
}


package Class0;

public class HomeWork10 {
    public static void main(String[] args) {
       //Write a java program to find the second largest number in the array?

        int[] numbers={30,456,76,89,200};

        int largest=numbers[0];
        int secondLargest=numbers[0];
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]>largest){
                secondLargest=largest;
                largest=numbers[i];
            } else if (numbers[i]>secondLargest) {
                secondLargest=numbers[i];

            }

        }

        System.out.println(secondLargest);
    }
}

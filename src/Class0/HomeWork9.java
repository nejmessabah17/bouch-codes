package Class0;

public class HomeWork9 {
    public static void main(String[] args) {
        //9)Maximum and minimum number in the array?
        int[] num={300,20,68,650,129};
        int min=num[0];
        int max=num[0];

        for (int i=0;i<num.length;i++){
            if (num[i]>max) {
                max = num[i];
            }else if (num[i]<min) {
                min = num[i];
            }
            }
            System.out.println(min);
            System.out.println(max);
        }
    }


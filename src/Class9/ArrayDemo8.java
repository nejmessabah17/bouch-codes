package Class9;

public class ArrayDemo8 {
    public static void main(String[] args) {
        double[] arr={10.5,12.0,45,10.5,23,10.5};
        //write a program that can tell us how many times the number 10.5 is present in the

        int count=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]==10.5){
                count++;//or count=count+1;



            }
        }
        System.out.println(count);
    }
    
}

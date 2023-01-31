package Class15;

public class Task1 {
    int largerNumber(int num1,int num2) {


        if (num1 > num2) {
            return num1;
        } else {
            return num2;

        }
    }

    public static void main(String[] args) {

        Task1 mp=new Task1();
        System.out.println(mp.largerNumber(20,55));
    }
}
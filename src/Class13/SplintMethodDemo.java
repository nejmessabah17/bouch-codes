package Class13;

public class SplintMethodDemo {
    public static void main(String[] args) {
        String str="i like java. i write a lot of code i am from batch 15";
        String [] strArr=str.split("[.?!]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());

    }
}

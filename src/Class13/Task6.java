package Class13;

public class Task6 {
    public static void main(String[] args) {

        // 6) How would you swap  2 strings without a temporary variable?

        String x = "java";
        String y = "task";


        String z;
        z = x;
        x = y;
        y=z;
        System.out.println(x);
        System.out.println(y);

    }
}

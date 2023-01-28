package Class12;

public class Task2 {
    public static void main(String[] args) {
        //  2) Create a String and print it in reverse order (Sunday → yadnuS).
        String str = "Sunday";

        for (int i = str.length() - 1; i >= 0; i--) {

            System.out.print(str.charAt(i));
        }
//method2
        System.out.println("");

        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());



        StringBuilder sbuilder=new StringBuilder(str);
        System.out.println(sbuilder.reverse());

    }
}

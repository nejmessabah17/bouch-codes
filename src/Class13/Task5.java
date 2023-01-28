package Class13;

public class Task5 {
    public static void main(String[] args) {
        //5) How would you check if String is palindrome or not? aba=> true
        //Abbc =>false
        String input="AbA";
        StringBuilder str=new StringBuilder(input);
        String output=str.reverse().toString();
        System.out.println("output: "+output);
        if(input.equals(output)){
            System.out.println("string is palindrome");

        } else  {
            System.out.println("string is not palindrome");

        }
    }
}

package Class15;

public class Task3 {


    /*
    3) Create a method that will print whether given String is palindrome or not.

    return type => void
    name=> ispalindrome
    parameters=>string inputstr
    {
    }
    example dad=>dad true
    abc=>cba false

     */
    void isPalindorme(String str) {

        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if (str.equals(reversedStr)) {
            System.out.println(str + " is palindorme");
        }else {
            System.out.println(str+" not is palindorme");
        }
    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        //String resulttask3.isPalindorme("kaya");can't assign void methods to variables
       // System.out.println(task3.isPalindorme("kaya"));can't
        task3.isPalindorme("kaya");

    }

}

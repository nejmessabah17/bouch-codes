package Class12;

import java.util.Locale;

public class StringDemo2 {
    public static void main(String[] args) {
        //only converts the upper  case letters to lower case
        String str ="JAVA IS FUN 11352#$%";
        String newStr=str.toLowerCase();
        System.out.println(newStr);


        String str2="i love java";
        String upperCaseLetter=str2.toUpperCase();
        System.out.println(upperCaseLetter);


    }
}

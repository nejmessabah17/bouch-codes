package Class17;

public class Task3 {
    public static void main(String[] args) {
        /*
        3) Create a method that will accept a String as a parameter
        and return a new String that consist only of vowels.
         Method should be available inside the class only
         where it was declared and executed by calling it is name.

        return type=>string
        name=>getOnlyVowels
        parameter=>string inputStr

         */


           System.out.println(getOnlyVowels("Java"));

}

    private static String getOnlyVowels(String inputStr){
        // AEIOUY aeiouy
        // Asghar => Aa
        return inputStr.replaceAll("[^AEIOUYaeiouy]","");
    }



}


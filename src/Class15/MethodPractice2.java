package Class15;

public class MethodPractice2 {
    //create a method that takes a string reverse it and return the reversed string
    // call the method reverseStr


    //return string
//string
    //reverseStr
    String reverseStr(String input) {
        String newStr= "sunday";
        for (int i = input.length()-1; i>= 0; i--) {
            newStr+= input.charAt(i);

        }
        return newStr;
    }
}
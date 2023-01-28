package Class13;

public class StringRecap {
    public static void main(String[] args) {
        //how can i print all the letters from this string one by one

        String str = "java is great";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
            //what is the input to the charAt() method its int out is a char
            //count how many times  the letter a has appeared in the above string

            int count = 0;
            for (int i = 0; i < str.length(); i++)
                if (str.charAt(i) == 'a') {
                    System.out.println();


                }

        }
    }

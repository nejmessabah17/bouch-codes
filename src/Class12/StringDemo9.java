package Class12;

public class StringDemo9 {
    public static void main(String[] args) {
        String str="jdfm 568990  #$%^^&";
        int counter=0;
        for (int i=0;i<str.length();i++){
            if (Character.isAlphabetic(str.charAt(i))){
                counter++;
            }
        }
        System.out.println("total isAlphabetic in str "+counter);
    }
}
package Class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
//replace all upper caseletters from A to Z
        String str="ASDERTYHHGUIJ1235687@##$$%^";
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[a-z]","#"));
        System.out.println(str.replaceAll("[0-9]","#"));
        System.out.println(str.replaceAll("[A-Za-z]","#"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        //  do not replace all lower case letters from A-Z and lower case letters from a-z
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));




    }
}

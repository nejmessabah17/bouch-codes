package Class12;

public class StringDemo11 {
    public static void main(String[] args) {
        String str = "send it to support channel.more java";
        //returns the new String from this index
        String newStr=str.substring(5);
        System.out.println(newStr);
// we also specify the starting point and ending point
        System.out.println(str.substring(0,26));

    }
}

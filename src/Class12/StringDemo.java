package Class12;

public class StringDemo {
    public static void main(String[] args) {

        //Creating an object of the string class
        String strObj=new String("java");
        //another way of creating an object of string class a shorter way
        //mostly this is how we create the objects of string class
        String strObj2="java";
        System.out.println(strObj2.length());
        String str="banana ";
        int len=str.length();
        System.out.println(len);
        String name="rafik nejjjj";
        if (name.length()>10){
            System.out.println("name can't be more than 10 letters");
        }

    }
}

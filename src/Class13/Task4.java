package Class13;

public class Task4 {
    public static void main(String[] args) {
        //4) How would you reverse a String word by word? for example
        //        // input=>This is sentence i want to reverse
        //        // output=>sihT si ecnetnes i tnaw ot esrever

      /*
        StringBuilder st=new StringBuilder("this is sentence i want to reverse");
        System.out.println(st.reverse());
        String str=st.toString();  //converting a StringBuilder to string so that we can call methods from string
        str.sp*/

     //method2
        String str = "this is sentence i want to reverse";
        String[] arr = str.split(" ");
        for (String word : arr) {
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));

            }
            System.out.print(" ");
        }

//method3
        for (String word:arr){
            System.out.print(new StringBuilder(word).reverse()+" ");
        }

    }

}
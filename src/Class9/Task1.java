package Class9;

public class Task1 {
    public static void main(String[] args) {
        /*
        print num from 1 to 50 except that devise per 3
        */
        for (int i=0;i<50;i++){
            if (i%3==0){
                continue;
            }
            System.out.println(i);
        }
    }
}

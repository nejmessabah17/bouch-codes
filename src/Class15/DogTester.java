package Class15;

public class DogTester {
    public static void main(String[] args) {
        System.out.println("start");
        D0g dog=new D0g();
        dog.printFood();
        System.out.println("End");

        for (int i=0;i<2;i++){
            System.out.println(i);
        }
       // System.out.println(i); can't use outside of block
    }
}

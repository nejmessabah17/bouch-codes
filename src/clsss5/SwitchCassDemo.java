package clsss5;

public class SwitchCassDemo {
    public static void main(String[] args) {



        int day=1;
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
            case 3:
                System.out.println("wednesday");
            case 4:
                System.out.println("thursday");
            case 5:
                System.out.println("friday");
            case 6:
                System.out.println("saturday");
            case 7:
                System.out.println("sunday");
            default:
                System.out.println("wrong day");

        }
    }
}

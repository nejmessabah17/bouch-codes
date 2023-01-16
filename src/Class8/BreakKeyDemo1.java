package Class8;

public class BreakKeyDemo1 {
    public static void main(String[] args) {

        boolean summer = true;
        int temp = 75;
        while (summer) {
            if (temp <= 100) {
                System.out.println("i love summer because Temperature is " + temp);

// create below program without break
            } else {
                System.out.println("its very hot " + temp);
             break;      //  can do summer=false; or break;
            }
                temp += 5;
            }


        }

    }
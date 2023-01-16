package clsss5;

public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);


        boolean boughtCho = true;
        boolean boughtFlowers = true;
        if (boughtCho||boughtFlowers){
            System.out.println("i am happy");

        }else {
            System.out.println("i am sad");
            boolean wifi=true;
            boolean fiveG=false;
            if (wifi||fiveG){
                System.out.println("you are good for browsing the internet");
            }else {
                System.out.println("either connect to wifi or to 5G");
            }
        }


    }
}

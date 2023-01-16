package class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country = "USA";
        System.out.println(country.toLowerCase());
        switch (country.toLowerCase()) { // converts the to lowercase USA==>usa
            case "usa":

                System.out.println("burgers");
                break;
            case "morocco":
                System.out.println("couscous");
                break;
            default:
                System.out.println("wrong country");
        }
        }
    }

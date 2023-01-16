package class6;

public class LogicalOrDemo {
    public static void main(String[] args) {


        String day="Monday";


        if (day.equalsIgnoreCase("Monday")|| day.equalsIgnoreCase( "Friday")){
            System.out.println("no class to day enjoy");
        } else if (day.equalsIgnoreCase("saturday")|| day.equalsIgnoreCase( "sunday")){
            System.out.println("java class enjoy");
        }else if (day.equalsIgnoreCase("wednesday")|| day.equalsIgnoreCase("tuesday")){
            System.out.println("manual testing class");

        } else if (day.equalsIgnoreCase("thursday")) {
            System.out.println("review class");


        }else {
            System.out.println("wrong day entered");
        }
    }
}

package Class7;

public class Task1 {
    public static void main(String[] args) {
        /*  create a boolean


        */

        boolean workDay=true;
        int day=1;
        while (workDay){
            if (day <= 5){
                System.out.println("i need a day off");


            }else {
                System.out.println("i do not need a day off anymore");
                workDay=false;

            }
            day++;    //it is equal to day= day+1 day+=1

        }
    }
}

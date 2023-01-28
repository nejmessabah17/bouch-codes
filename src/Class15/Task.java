package Class15;

public class Task {
   /* Create a method createEmail(). Based on values of users name, lastName and email type,
    your method should return complete email Address. Example:  createEmail(John, Snow, gmail) →
     johnsnow@gmail.com or
     return type=>string
     name=>createmail
     prameters=>string firstName String lastName String emailType
     {
     concat
     }
    */


    String createEmail(String firstName,String lastName,String emailType){
        return firstName+lastName+"@"+emailType+".com";
    }

    public static void main(String[] args) {
        Task mp=new Task();
        System.out.println(mp.createEmail("John","Snow","gmail"));
    }

}

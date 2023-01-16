package class4;

public class NestIfDemo7 {
    public static void main(String[] args) {

       boolean studyHard= true;
       int salary=120000;
       if(studyHard){
           System.out.println("we get the job");

           if (salary>100000){
               System.out.println("lets buy tesla");
           }else{
               System.out.println("lets buy tioyota");
           }




       }else {
           System.out.println("it might a litlle longer for us to get the job");
       }
    }
}

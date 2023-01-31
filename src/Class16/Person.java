package Class16;

public class Person {


     double bankBalance=1250000;
    String address="Street 123"; //default access level is applied
    public String name="jon snow";


    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
    }
}

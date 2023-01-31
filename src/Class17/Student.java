package Class17;

import Class16.Students;

public class Student {
    /*

     */


    String id;
    String name;
    int age;
    double weight;

    public Student(String sName, String sId, int sAge, double sWeight) {
        id = sId;
        name = sName;
        weight = sWeight;
        age = sAge;

    }

    public Student(String sName, String sId, int sAge) {
        id = sId;
        name = sName;
        age = sAge;

    }
        void printInfo () {
            System.out.println(name + " " + id + " " + age + " " + weight);
        }


    }

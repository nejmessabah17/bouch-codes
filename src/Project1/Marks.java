package Project1;

abstract public class Marks {
    /*
    2. We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code

     */

    abstract double getPercentage();
}

class A extends Marks {
    double sub1;
    double sub2;
    double sub3;

    A(double sub1, double sub2, double sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    double getPercentage() {
        System.out.println((sub1 + sub2 + sub3) / 3);
        return 0;
    }

}

class B extends Marks {
    double sub1;
    double sub2;
    double sub3;
    double sub4;

    B(double sub1, double sub2, double sub3, double sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    @Override
    double getPercentage() {

        System.out.println((sub1 + sub2 + sub3 + sub4) / 4);
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        A a = new A(5.7, 6, 5.9);
        B b = new B(10, 4.7, 7.8, 6);
        a.getPercentage();
        b.getPercentage();
    }


}



package Class15;

public class task6 {

    /*
    6)Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F



     */

    String getGrade(int Score){
        if (Score>=90) {
            return "A";

        } else if (Score>=80) {
            return "B";


        } else if (Score>=70) {
            return "C";


        } else if (Score>=50) {
            return "D";


        }else {
            return "F";
        }
    }





}

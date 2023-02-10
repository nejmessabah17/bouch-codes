package Task1Class20;

public class Shape {
   /*
    /1. Write program: Shape class has a constructor that takes
     the radius and has a subclass as  circle class.
     In circle class create a method to calculate the area of circle.
      Test your code*

*/
    int radius;

    Shape(int radius) {
        this.radius = radius;
    }
}
        class Circle extends Shape{
            double area=4;
            Circle(int radius) {
                super(radius);
                area = (radius * radius) * 22 / 7;
            }
            void circleArea(){
                System.out.println("The area of circle is "+ area);
            }

            public static void main(String[] args) {
                Circle area=new Circle(4);
                area.circleArea();

            }

        }















package Project1;



public interface Shape {
    /*   Create an Interface 'Shape' with undefined
      methods as calculateArea and
      calculatePerimiter. Create 2 classes Circle &
      Square that implements functionality defined in
      the Shape Interface. Test your code.

    */

        void calculateArea();

        void calculatePerimeter();
    }

    class Circle implements Shape {

        double radius;

        Circle(double radius) {
            this.radius = radius;

        }

        @Override
        public void calculateArea() {
            System.out.println("the area of circle is " + Math.PI * radius * radius);

        }

        @Override
        public void calculatePerimeter() {
            System.out.println("the perimeter of circle is " + 2 * Math.PI * radius);
        }

    }

    class Square implements Shape {

        double side;


        Square(double side) {

            this.side = side;
        }


        @Override
        public void calculateArea() {
            System.out.println("the area of square is " + side * side);

        }

        @Override
        public void calculatePerimeter() {
            System.out.println("the perimeter of square is " + 4 * side);

        }
    }

    class Test1 {
        public static void main(String[] args) {

            Shape[] shapes = {new Circle(3.4), new Square(2.7) };
            for (Shape shape:shapes){
                shape.calculateArea();
                shape.calculatePerimeter();
            }

        }
    }




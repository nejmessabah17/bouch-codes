package Project1;

public class Car {
    /*
3. Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount

     */

    double carPrice;
    String color;

   Car(){


    }

    double calculateSalePrice() {
        return carPrice;
    }
}

class Track extends Car {
    double weight;


    Track(double weight, double carPrice) {
        super();
        this.weight = weight;
        this.carPrice = carPrice;

    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            carPrice = carPrice - (carPrice * 5 / 100);

        } else {
            carPrice = carPrice - (carPrice * 10 / 100);
        }
        System.out.println("The Track sale price is " + carPrice);
        return carPrice;
    }
}

class Sedan extends Car {
    double length;


    Sedan(double lenght, double carPrice) {
        super();
        this.length = length;
        this.carPrice = carPrice;

    }

    @Override
    double calculateSalePrice() {
        if (length > 20f) {
            carPrice = carPrice - (carPrice * 5 / 100);

        } else {
            carPrice = carPrice - (carPrice * 10 / 100);
        }
        System.out.println("The Sedan sale price is " + carPrice);
        return carPrice;
    }
}

class Task {
    public static void main(String[] args) {
        Car[] cars = {new Track(1000, 40000), new Sedan(10, 25000)};
        for (Car car : cars) {
            car.calculateSalePrice();
        }
    }
}



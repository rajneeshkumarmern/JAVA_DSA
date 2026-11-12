//4. Implement inheritance using a Vehicle and Car class.
package Oop;

class Vehicle {

    String brand = "Honda";

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }
}

public class Vehicle04 {

    public static void main(String[] args) {

        Car car = new Car();

        System.out.println("Brand: " + car.brand);

        car.start();
        car.drive();
    }
}
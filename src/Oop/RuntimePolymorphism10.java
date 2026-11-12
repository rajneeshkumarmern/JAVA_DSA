//10. Create a program demonstrating runtime polymorphism.
package Oop;

class AnimalType {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class DogType extends AnimalType {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class CatType extends AnimalType {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphism10 {

    public static void main(String[] args) {

        AnimalType animal;

        animal = new DogType();
        animal.sound();

        animal = new CatType();
        animal.sound();
    }
}
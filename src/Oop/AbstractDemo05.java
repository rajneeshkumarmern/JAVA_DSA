//5. Create an abstract class and implement its methods.
package Oop;

abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractDemo05 {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
        dog.eat();
    }
}



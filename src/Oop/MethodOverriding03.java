package Oop;
//3. Demonstrate method overriding.
class Parent {

    void display() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {

    @Override
    void display() {
        System.out.println("This is Child class");
    }
}

public class MethodOverriding03 {

    public static void main(String[] args) {

        Child obj = new Child();

        obj.display();
    }
}
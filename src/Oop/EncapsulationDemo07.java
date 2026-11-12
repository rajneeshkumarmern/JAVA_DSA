//7. Demonstrate encapsulation using private variables and getters/setters.
package Oop;

class Student {

    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class EncapsulationDemo07 {

    public static void main(String[] args) {

        Student student = new Student();

        student.setId(101);
        student.setName("Rajneesh");

        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
    }
}
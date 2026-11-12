//9. Demonstrate constructor overloading.
package Oop;

class EmployeeData {

    int id;
    String name;
    double salary;

    EmployeeData() {
        id = 0;
        name = "Unknown";
        salary = 0;
    }

    EmployeeData(int id, String name) {
        this.id = id;
        this.name = name;
        salary = 15000;
    }

    EmployeeData(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class ConstructorOverloading09 {

    public static void main(String[] args) {

        EmployeeData emp1 = new EmployeeData();

        EmployeeData emp2 = new EmployeeData(101, "Rajneesh");

        EmployeeData emp3 = new EmployeeData(102, "Amit", 30000);

        emp1.display();
        emp2.display();
        emp3.display();
    }
}
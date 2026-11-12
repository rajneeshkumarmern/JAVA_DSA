package Oop;
//1. Create an Employee class with fields and methods.
public class Employee01 {
        int id;
        String name;
        double salary;

        void displayDetails() {
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Salary: " + salary);
        }

        public static void main(String[] args) {

            Employee01 emp = new Employee01();

            emp.id = 101;
            emp.name = "Rajneesh";
            emp.salary = 25000;

            emp.displayDetails();
        }
    }


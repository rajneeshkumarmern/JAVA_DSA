package ExceptionHandling;
import java.util.Scanner;
public class ExceptionHandling10 {
    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Not Eligible");
        }
        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = in.nextInt();
        try{
        checkAge(age);
    }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program Completed");
        in.close();

    }

}


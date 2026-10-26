package Methods;
import java.util.Scanner;
public class Methods11 {
    static void vote(String name,int age){
        if(age>=18){
            System.out.println("Eligible for Vote");
        }else{
            System.out.println("Not Eligible for Vote");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Voter Name: ");
        String name = in.nextLine();
        System.out.println("Enter your age: ");
        int age = in.nextInt();
        vote(name,age);
    }
}

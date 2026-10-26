package ExceptionHandling;

public class ExceptionHandling08 {
    public static void main(String[] args){
        int age = 15;
        try{
        if(age<18){
            throw new IllegalArgumentException("You must be 18 or older");
        }
        System.out.println("You are eligible");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program completed");
    }
}

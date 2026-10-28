package ExceptionHandling;

public class ExceptionHandling25 {

    public static void main(String[] args){

        int a = 10;
        int b = 0;
        try{
            int result = a/b;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally block executed");
        }
        System.out.println("Program completed");
    }
}


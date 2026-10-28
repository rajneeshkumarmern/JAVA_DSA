package ExceptionHandling;

public class ExceptionHandling21 {
        public static void main(String[] args){

            int a = 100;
            int b = 0;
            try{
                int result = a/b;
                System.out.println(result);
            }catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Program Completed");
        }
    }


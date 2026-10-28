package ExceptionHandling;

public class ExceptionHandling27 {
    public static void main (String[] args){

        int a = 10;
        int b = 0;
        try{
            try{
                int result = a/b;
                System.out.println(result);
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program completed");
    }
}



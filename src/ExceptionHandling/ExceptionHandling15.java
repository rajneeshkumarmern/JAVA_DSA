package ExceptionHandling;

public class ExceptionHandling15 {
    public static void main (String[] args){
        try {
            int result = 10 / 0;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
        }catch (Exception e) {
            System.out.println("General exception");

        }
    }
}

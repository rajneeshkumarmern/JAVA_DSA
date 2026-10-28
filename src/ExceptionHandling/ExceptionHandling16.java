package ExceptionHandling;

public class ExceptionHandling16 {
    public static void main(String[] args){
        try {
            int[] arr = {10, 20, 30, 40};
            System.out.println(arr[5]);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic error");
        }catch (Exception e){
            System.out.println("General exception");
        }
    }
}

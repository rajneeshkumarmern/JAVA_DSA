package ExceptionHandling;

public class ExceptionHandling17 {
    public static void main (String[] args){
        try {
            String str = null;
            System.out.println(str.length());
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }catch(RuntimeException e) {
            System.out.println("Runtime Error");
        }catch(Exception e){
            System.out.println("General Error");
        }
    }
}

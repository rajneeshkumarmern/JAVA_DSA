package ExceptionHandling;

public class ExceptionHandling18 {
    public static void main(String[] args){
        try {
            int nums = Integer.parseInt("abc");
            System.out.println(nums);
        }catch (NumberFormatException e){
            System.out.println("Exception Handled: " + e.getMessage());
        }
    }
}

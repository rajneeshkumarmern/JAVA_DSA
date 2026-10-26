package ExceptionHandling;

public class ExceptionHandling05 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int a = 10;
        int b = 0;
        try {
            int result = a / b;

            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot be devide by Zero");
        }
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");

        }
    }
}

package ExceptionHandling;

public class ExceptionHandling14 {
    public static void main(String[] args) {
        System.out.println("Program started");

        try {
            try {
                    int[] arr = {10, 20, 30};
                    System.out.println(arr[5]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println( "Invalid array index");
                }
                System.out.println("Outer try continues");

            }  catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Outer exception handled");
                }
        System.out.println("Program ended");
    }
}

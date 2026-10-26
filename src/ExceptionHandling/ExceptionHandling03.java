package ExceptionHandling;

public class ExceptionHandling03 {
    public static void main(String[] args){
        int[] arr = {10,20,30};
        try {
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
    }

    public static class ExceptionHandling {
    }
}

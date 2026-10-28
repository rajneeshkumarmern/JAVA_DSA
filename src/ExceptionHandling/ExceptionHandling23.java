package ExceptionHandling;

public class ExceptionHandling23 {
    public static void main(String[] args){
        int [] arr = {10,20,30};
        try{
            int b = arr[5];
            System.out.println(b);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program completed");
    }
}



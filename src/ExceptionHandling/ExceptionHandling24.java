package ExceptionHandling;

public class ExceptionHandling24 {
    public static void main(String[] args){

        int[] arr = {10,20,30};
            String str = "hello";
            try{
                int a = Integer.parseInt(str);
                System.out.println(a);
                int b = arr[5];
                System.out.println(b);
            }catch(NumberFormatException e){
                System.out.println(e.getMessage());

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }

        System.out.println("Program completed");
    }
}



package ExceptionHandling;

public class ExceptionHandling22 {
    public static void main(String[] args){
        String str = "abc";
        try{
            int a = Integer.parseInt("abc");
            System.out.println(a);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program Completed");
    }
}



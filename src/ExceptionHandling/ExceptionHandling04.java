package ExceptionHandling;

public class ExceptionHandling04 {
    public static void main(String[] args) {
        String str = "abc";
        try {
            int a = Integer.parseInt(str);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("Cannot convert String into int");
        }
    }
}

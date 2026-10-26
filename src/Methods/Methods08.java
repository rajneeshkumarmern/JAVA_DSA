package Methods;

public class Methods08 {
    static int square(int n){
        System.out.println("Inside multiply method");
        return n*n;
    }
    public static void main(String[] args){
        System.out.println("Program Started");
        int res = square(5);
        int res1 = square(8);
        int res2 = square(12);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println("Program End");
    }
}

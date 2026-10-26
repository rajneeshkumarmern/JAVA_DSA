package ExceptionHandling;

public class ExceptionHandling11 {
    static void method1(){
        int result = 10/0;
    }
    static void method2(){
        method1();
    }
    static void method3(){
        method2();
    }
    public static void main(String[] args){
        try {
            method3();
        }catch (ArithmeticException e) {
         System.out.println("Exception Handled: " + e.getMessage());
        }
        System.out.println("Program completed");
        }
    }


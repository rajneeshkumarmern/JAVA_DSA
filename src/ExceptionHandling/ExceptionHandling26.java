package ExceptionHandling;

public class ExceptionHandling26 {

    static void method1(int a, int b){
        method2();
        try{
            int ans = a/b;
            System.out.println(ans);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program completed");
    }
    static void method2(){
        method3();
    }
        static void method3(){

        }
        public static void main(String[] args){

                 method1(10,0);

        }
    }



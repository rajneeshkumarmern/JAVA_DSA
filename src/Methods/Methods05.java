package Methods;

public class Methods05 {
    static double calculateArea(double radius){
        return 3.14158*radius*radius;
    }
    public static void main(String[] args){
        double ans = calculateArea(4.6);
        System.out.println(ans);
    }

}

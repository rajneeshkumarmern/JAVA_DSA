package Collections;
import java.util.ArrayList;
public class Collections01 {
    public static void main(String[] args){
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
        System.out.println(numbers.get(2));
        System.out.println(numbers.set(2,35));
        System.out.println(numbers.remove(3));
        System.out.println(numbers.contains(40));
    }
}

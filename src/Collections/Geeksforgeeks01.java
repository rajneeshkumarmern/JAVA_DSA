package Collections;
import java.util.ArrayList;
import java.util.Collections;
public class Geeksforgeeks01 {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banaba");
        fruits.add("Apple");
        Collections.sort(fruits);

        System.out.println(fruits);
    }

}

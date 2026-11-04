package Collections;
import java.util.*;
public class Geeksforgeeks08 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(Arrays.asList("A","B","C"));
        Collections.addAll(list, "D","E","F");
        System.out.println("Updated List: " + list);
    }
}

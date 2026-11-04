package Collections;
import java.util.*;
public class Geeksforgeeks09 {
    public static void main(String[] args){
        List<String>list = new ArrayList<>(Arrays.asList("A","B","C","The Taj Mahal"));
        System.out.println("list before operation: " + list);
        boolean result = Collections.addAll(list, "1","2","3");
        System.out.println(result);
        System.out.println(list);

    }
}

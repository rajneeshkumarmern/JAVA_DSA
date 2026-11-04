package Collections;
import java.util.*;
public class Geeksforgeeks12 {
    public static void main(String[] args){
        Collection<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mongo");

        list.remove("Banana");
        System.out.println(list);
    }
}

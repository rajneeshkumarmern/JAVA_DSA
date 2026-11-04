package Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Geeksforgeeks02 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mongo");
        list.add("Grapes");
        Collections.addAll(list,"Kiwi","PineApple" );
        System.out.println("After Adding: " + list);
    }
}

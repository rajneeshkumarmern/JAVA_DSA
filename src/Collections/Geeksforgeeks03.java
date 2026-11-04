package Collections;
import java.util.ArrayList;
public class Geeksforgeeks03 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("PineApple");
        list.add("Mongo");
        //remove element by value
        list.remove("Banana");
        //remove element by index
        list.remove(0);
        System.out.println("After removing: " + list);
    }

}

package Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Geeksforgeeks04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("mango");
        list.add("banana");
        list.add("pineapple");
        list.add("garpes");
        if (list.contains("mango")) {
            System.out.println("Mongo is available");
        }
    }
}

package Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Geeksforgeeks05 {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("mango");
        fruits.add("grapes");
        fruits.set(0,"Kiwi");
        System.out.println("Updated Fruits: " + fruits);
    }
}

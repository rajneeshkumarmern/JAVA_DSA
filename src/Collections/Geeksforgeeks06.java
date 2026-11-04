package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Geeksforgeeks06 {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("kiwi");
        fruits.add("mongo");
        fruits.add("grapes");
        fruits.add("pineapple");
        fruits.add("papaya");
        Collections.sort(fruits);
        System.out.println(fruits);
    }
}

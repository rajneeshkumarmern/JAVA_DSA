package Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Geeksforgeeks07 {
    public static void main (String[] args){
        ArrayList<String> letter = new ArrayList<>();

        letter.add("A");
        letter.add("B");
        letter.add("C");
        Collections.addAll(letter,"D","E","F");
        System.out.println(letter);

    }

}

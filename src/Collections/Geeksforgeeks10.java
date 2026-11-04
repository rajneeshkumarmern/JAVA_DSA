package Collections;
import java.util.*;
public class Geeksforgeeks10 {
    public static void main(String[] args){
        Integer[] a = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(a);
        System.out.println(list);
        a[2]  = 20;
        System.out.println(list.get(2));
        System.out.println(list);
    }
}

package Collections;
import java.util.ArrayList;
public class Collections07 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        int smallest = numbers.get(0);
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i<numbers.size(); i++) {
            int current = numbers.get(i);
            if (current < smallest) {
                secondSmallest = smallest;
                smallest = current;
            } else if (current<secondSmallest && current>smallest) {
                secondSmallest = current;
            }
        }
            System.out.println("Smallest: " + smallest);
            System.out.println("Second Smallest: " + secondSmallest);
        }
    }



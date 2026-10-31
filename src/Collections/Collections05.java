package Collections;
import java.util.ArrayList;
import java.util.Objects;

public class Collections05 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);
        numbers.add(50);

        for (int i = 0; i < numbers.size(); i++) {
            int count = 0;
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(i).equals(numbers.get(j))) {
                    count++;
                }
            }
                if(count == 1){
                System.out.println(numbers.get(i));

                }
            }
        }
    }



package Collections;
import java.util.ArrayList;
public class Collections04 {
    public static void main(String[] args){
        ArrayList <Integer> numbers = new ArrayList<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        for(int i = 0; i<numbers.size(); i++){
            for(int j = i+1; j<numbers.size(); j++){
                if(numbers.get(i) == numbers.get(j)){
                    int value= numbers.get(i);

                    if(!duplicates.contains(value)) {
                        System.out.println(value);
                        duplicates.add(value);
                    }
                }


            }
        }
    }
}

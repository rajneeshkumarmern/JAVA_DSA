package Collections;
import java.util.ArrayList;
public class Collections09 {
    public static void main(String[] args){
        ArrayList<Integer>numbers = new ArrayList<>();
        ArrayList<Integer>uniqueNumbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        int count = 0;
        for(int i = 0; i<numbers.size(); i++){
            for(int j=i+1; j<numbers.size(); j++){
                if(numbers.get(i) == numbers.get(j)){
                    count++;
                    int value = numbers.get(i);
                    if(!uniqueNumbers.contains(value)){
                        System.out.println("Unique Numbers: " + value);
                        uniqueNumbers.add(value);
                        System.out.println("Count Unique: " + count);
                    }
                }
            }
        }
    }

}

package ArrayString;
//2	Find the second-largest element in an array
public class Array02 {
    public static void main(String[] args){
        int[] arr = {5,52,5,5};
        int firstlargest = arr[0];
        int secondlargest = Integer.MIN_VALUE;
        boolean found = false;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]> firstlargest) {
                secondlargest = firstlargest;
                firstlargest = arr[i];
                found = true;
            }else if(arr[i]<firstlargest && (!found || secondlargest<arr[i])){
                secondlargest = arr[i];
                found = true;
            }
            }
        if(found){
            System.out.println(secondlargest);

        }
            }
        }
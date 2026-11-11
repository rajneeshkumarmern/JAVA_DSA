package ArrayString;
//Find largest element	20 → 40
public class Array00 {
    public static void main(String[] args){
        int[] arr = {10,52,35,40,50};
        int largest = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}

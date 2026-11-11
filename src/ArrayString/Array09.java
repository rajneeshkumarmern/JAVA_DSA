package ArrayString;
//Move zeros to the end	2 → 0
public class Array09 {
    public static void main(String[] args){
         int [] arr = {0,2,0,40,58,9};
         int index = 0;
        // First loop: Move non-zero elements
        for(int i = 0; i<arr.length; i++){
             if(arr[i] != 0){
                 arr[index] = arr[i];
                 index++;

             }
         }
        // Second loop: Fill remaining positions with zero
        for(int i = index; i<arr.length; i++) {
            arr[i] = 0;
        }
        for(int i = 0;i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
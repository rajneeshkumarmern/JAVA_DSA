package ArrayString;
//Find frequency of elements	3 → 2 occurs twice
public class Array12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    System.out.println(arr[i]);
                }
            }
        }
    }
}

package ArrayString;
//Sort an array	2 → 3
public class Array04 {
    public static void main(String[] args) {
        int arr[] = {5, 67, 59, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}


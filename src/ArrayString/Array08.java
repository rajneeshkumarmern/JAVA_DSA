
package ArrayString;

// Find duplicate elements
public class Array08 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 1, 3, 2, 4};

        for (int i = 0; i < arr.length; i++) {

            boolean alreadyChecked = false;

            // Check previous elements
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) {
                continue;
            }

            // Find duplicate
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}

package ArrayString;
//34	Find missing number	5 → 3
public class Array06 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        //Get last number
        int n = arr[arr.length - 1];

        int expectedSum = n * (n + 1) / 2;
        // Calculate actual array sum
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];

        }
        //find missing number
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing Number: " + missingNumber);
    }
}
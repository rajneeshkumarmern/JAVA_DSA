package ArrayString;
//Merge two arrays	2, 4 → 4
public class Array11 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {4, 5, 6};
        int[] merge = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
        merge[i] = arr1[i];
    }
        for(int i = 0; i<arr2.length; i++){
            merge[arr1.length + i] = arr2[i];
        }
        for(int i = 0; i<merge.length; i++){
            System.out.println( merge[i] + " ");

        }

    }
}

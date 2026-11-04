package ArrayString;
//Find the largest and smallest element in an array.
public class Array01 {
    public static void main(String[] args){

        int[] a = {10,20,30,40};
        int max = a[0];
        int min = a[0];

        for(int i=1; i<a.length; i++){
            if(a[i]>max) {
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];

            }

        }
        System.out.println(max);
        System.out.println(min);

    }
}

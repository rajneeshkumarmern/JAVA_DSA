package Conditionals;

public class Reverse {
    public static void main(String[] args){
        int nums = 28473;
        int rev = 0;
        while(nums>0){
            int rem = nums%10;
            nums/=10;
            rev = rev*10+rem;
        }
        System.out.println(nums);
    }
}

package Conditionals;
public class CountNums {
    public static void main(String[] args){
        int nums = 45567;
        int count = 0;
        while(nums>0){
            int rem = nums%10;
            if(rem == 5){
                count++;
            }
            nums=nums/10;
        }
        System.out.println(count);
    }

}

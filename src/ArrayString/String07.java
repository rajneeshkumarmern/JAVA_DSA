package ArrayString;
//	Check anagram	listen, silent → Yes
import java.util.Arrays;
public class String07 {
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";
        //you must first convert the String into a char[] array before using Arrays.sort().
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        if(c1.length != c2.length) {
            System.out.println("Not Anagram");
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i = 0; i<c1.length; i++){
            if(c1[i] != c2[i]){
                System.out.println("Not Anagram");
        }
        }
        System.out.println("Anagram");
    }

}

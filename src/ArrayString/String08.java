package ArrayString;
//	Count words in a sentence	"Java is easy" → 3
public class String08 {
    public static void main (String[] args){
        String s = " Welcome  to  Java World Rajneesh ";
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i-1) == ' ')){
                count++;
            }
        }
        System.out.println("Total Words: " + count);
    }
}

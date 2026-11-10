package ArrayString;
//Remove spaces from a string	"Java Programming" → "JavaProgramming"
public class String10 {
    public static void main(String [] args){
        String str = " Java programming";
        String[] space = str.split(" ");
        for(int i = 0; i<space.length; i++){
            System.out.print(space[i]);
        }

    }
}

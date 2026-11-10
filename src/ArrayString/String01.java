package ArrayString;
//16	Reverse a string	Java → avaJ
public class String01 {
    public static void main(String[] args){
        String str = "Java";
        for(int i= str.length()-1; i>=0; i-- ){
            //System.out.println(str);
            System.out.print(str.charAt(i));
        }
    }
}

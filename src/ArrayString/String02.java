package ArrayString;
//17	Check string palindrome	madam → Yes
public class String02 {
    public static void main(String[] args){
        String str = "Rama";
        String reverse = "";
        for(int i= str.length()-1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
            if(str.equalsIgnoreCase(reverse)) {
                System.out.println("Palindrome: ");
            }else{
                System.out.println("Not palindrome");

            }
        }
    }


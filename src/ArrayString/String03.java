package ArrayString;
//Count vowels and consonants	"hello" → 2 vowels
public class String03 {
    public static void main(String[] args) {
        String str = "Madam";
        int vowelsCount = 0;
        int consinantCount = 0;

        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            //uppercase characters are converted to lowercase before checking.
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            } else if (Character.isLetter(ch)){
                    consinantCount++;
                }

            }
        System.out.println("Vowels: " + vowelsCount);
        System.out.println("Consinant: " + consinantCount);


    }
    }


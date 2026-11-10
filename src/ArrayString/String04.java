package ArrayString;
//Count character frequency	banana → a=3
public class String04 {
    public static void main(String[] args) {

        String str = "Banana";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            boolean alreadyCounted = false;

            for (int k = 0; k < str.length(); k++) {

                if (str.charAt(i) == str.charAt(k)) {
                    count++;

                    if (k < i) {
                        alreadyCounted = true;
                    }
                }
            }

            if (!alreadyCounted) {
                System.out.println(str.charAt(i) + " = " + count);
            }
        }
    }
}
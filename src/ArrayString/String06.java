package ArrayString;
//21	Remove duplicate characters	banana → ban
public class String06 {
    public static void main(String[] args) {
        String str = "programming";

        for (int i = 0; i < str.length(); i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }
            // Skip if character already appeared
            if (duplicate){
                continue;
        }
                    System.out.print(str.charAt(i));
                }

            }
        }

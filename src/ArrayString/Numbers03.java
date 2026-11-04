
package ArrayString;

public class Numbers03 {
    public static void main(String[] args) {

        for (int a = 2; a <= 100; a++) {

            boolean isPrime = true;

            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(a + " ");
            }
        }
    }
}

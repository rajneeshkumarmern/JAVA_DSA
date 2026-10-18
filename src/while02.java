import java.util.Scanner;
public class while02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int num = 1;
        while(num<=5){
            System.out.println(num);
            num+=1;
        }

    }
}

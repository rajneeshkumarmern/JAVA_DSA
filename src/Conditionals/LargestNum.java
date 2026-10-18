package Conditionals;

import java.util.Scanner;

public class LargestNum {
    public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a Number: ");

    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();

    int max = a;
    if(a>b&&a>c)

    {
        System.out.println(a);
    }else if(b>a&&b>c){


        System.out.println(b);

    }else

    {
        System.out.println(c);
    }
}
}


package Week2;

import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            try{
                long x = sc.nextLong();
                System.out.println(x+ " can be fitted in:");
                if ( x>= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if ( x>=Short.MIN_VALUE &&  x <= Short.MAX_VALUE)
                    System.out.println("* short");
                if ( x>=Integer.MIN_VALUE &&  x <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if( x>=Long.MIN_VALUE &&  x <=Long.MAX_VALUE)
                    System.out.println("* long");
            } catch (Exception e) {
                String input = sc.next();
                System.out.println(input + " can't be fitted anywhere.");
            }
        }

        sc.close();
    }
}







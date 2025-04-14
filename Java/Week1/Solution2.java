package Week1;
import java.io.*;
import java.util.*;

    public class Solution2 {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            double d= scanner.nextDouble();
            scanner.nextLine();
            String s = scanner.nextLine();


            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: "+ i);

            scanner.close();
        }
    }



package HackerRankSolutions;

import java.io.*;
import java.util.*;

public class StringSplit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.split("[^A-Za-z]+");

        System.out.println(tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }


        scan.close();
    }
}



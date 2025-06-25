package HackerRankSolutions;

import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() != b.length()){
            return false;
        }
        int[] freqA = new int[26];
        int[] freqB = new int[26];

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            freqA[ch - 'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            freqB[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freqA[i] != freqB[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

package Week10;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        for(int i = 0; i<s.length();i++) freq [s.charAt(i)- 'a']++;
        for(int i =0; i < t.length(); i++) freq[t.charAt(i) - 'a']--;
        for (int f : freq) if(f != 0) return false;
        return true;

    }
}



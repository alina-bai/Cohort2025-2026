package Week3;

import java.sql.SQLOutput;

public class StringDetails {
    public static void main(String[] args) {
        String text = "Hello Java";
        printStringDetails(text);

    }
    public static void printStringDetails(String input) {
        int length = input.length();
        System.out.println("Length of the string: " + length);
        for (int i =0; i < length; i++) {
            System.out.println(input.charAt(i));
        }
    }

}

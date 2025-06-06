package Assignments.TextFormatting;

public class CamelCaseFormatter implements Formatter {
    public String format(String input) {
        String[] words = input.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            sb.append(Character.toUpperCase(words[i].charAt(0)))
                    .append(words[i].substring(1));
        }
        return sb.toString();
    }
}
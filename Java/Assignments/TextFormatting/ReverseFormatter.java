package Assignments.TextFormatting;

public class ReverseFormatter implements Formatter {
    public String format(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}

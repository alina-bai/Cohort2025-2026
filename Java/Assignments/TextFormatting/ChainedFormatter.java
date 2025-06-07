package Assignments.TextFormatting;

public class ChainedFormatter implements Formatter {
    private final Formatter[] formatters;

    public ChainedFormatter(Formatter[] formatters) {
        this.formatters = formatters;
    }

    public String format(String input) {
        String result = input;
        for (Formatter f : formatters) {
            result = f.format(result);
        }
        return result;
    }
}

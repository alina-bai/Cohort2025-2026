package Assignments.TextFormatting;

public class FormatFactory {
    public static Formatter getFormatter(String name) {
        switch (name) {
            case "UppercaseFormatter": return new UppercaseFormatter();
            case "LowercaseFormatter": return new LovercaseFormatter();
            case "DashFormatter": return new DashFormatter();
            case "ReverseFormatter": return new ReverseFormatter();
            case "CamelCaseFormatter": return new CamelCaseFormatter();
            default: throw new IllegalArgumentException("Unknown formatters: " + name);

        }
    }
    public static String applyFormatters(String input,Formatter[] formatters) {
        String result = input;for (Formatter formatter: formatters) {
            result= formatter.format(result);
        }
        return result;
    }
}
